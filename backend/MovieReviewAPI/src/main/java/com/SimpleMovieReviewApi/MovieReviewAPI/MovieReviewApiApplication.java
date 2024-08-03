package com.SimpleMovieReviewApi.MovieReviewAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieReviewApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewApiApplication.class, args);
	}

	@GetMapping("/root")
	public static String root(){
		return "hello";
	}

}
