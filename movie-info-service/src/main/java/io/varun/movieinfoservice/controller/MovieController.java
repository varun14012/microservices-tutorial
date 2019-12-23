package io.varun.movieinfoservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.varun.movieinfoservice.model.Movie;
import io.varun.movieinfoservice.model.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieController {
	private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);

	@Value("${api.key}")
	private String apiKey;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{movie_id}")
	public Movie getMovieInfo(@PathVariable("movie_id") String movieId) {
		MovieSummary movieSummary = restTemplate.getForObject(
				"http://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
		LOG.info("In getMovieInfo");
		return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());

	}

}
