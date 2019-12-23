package io.varun.ratingsdataservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.varun.ratingsdataservice.model.MovieRating;
import io.varun.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
	private static final Logger LOG = LoggerFactory.getLogger(RatingsController.class);

	@RequestMapping("/movies/{movie_id}")
	public MovieRating getRatings(@PathVariable("movie_id") String movieId) {
		LOG.info("In getRatings");
		return new MovieRating(movieId, 4);

	}

	@RequestMapping("/user/{user_id}")
	public UserRating getUserRatings(@PathVariable("user_id") String userId) {
		UserRating ratings = new UserRating();
		ratings.initData(userId);
		LOG.info("In getUserRatings");
		return ratings;

	}

}
