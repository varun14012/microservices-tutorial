package io.varun.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {
	private String userId;
	private List<MovieRating> movieRatings;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<MovieRating> getMovieRatings() {
		return movieRatings;
	}

	public void setMovieRatings(List<MovieRating> movieRatings) {
		this.movieRatings = movieRatings;
	}

	public void initData(String userId) {
		this.setUserId(userId);
		this.setMovieRatings(Arrays.asList(new MovieRating("100", 3), new MovieRating("200", 4)));
	}

}
