package io.varun.moviecatalogservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.varun.moviecatalogservice.model.CatalogItem;
import io.varun.moviecatalogservice.model.Movie;
import io.varun.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
//@RefreshScope
public class CatalogController {
	private static final Logger LOG = LoggerFactory.getLogger(CatalogController.class);

	@Autowired
	private RestTemplate restTemplate;

//	@Autowired
//	WebClient.Builder webClientBuilder;

	@RequestMapping("/{user_id}")
	@HystrixCommand(fallbackMethod = "fallbackMethod")
	public List<CatalogItem> getCatalog(@PathVariable("user_id") String userId) {

		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratings/user/" + userId,
				UserRating.class);
		LOG.info("In getCatalog");
		return userRating.getMovieRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
					Movie.class);
			return new CatalogItem(movie.getName(), movie.getDescription(), rating.getMovieRating());
		}).collect(Collectors.toList());

	}

	public List<CatalogItem> fallbackMethod(String userId) {
		LOG.info("In getCatalog");
		System.out.println("In fall back method.");
		return new ArrayList<CatalogItem>();
	}

}

/*
 * Alternative WebClient way Movie movie =
 * webClientBuilder.build().get().uri("http://localhost:8082/movies/"+
 * rating.getMovieId()) .retrieve().bodyToMono(Movie.class).block();
 */