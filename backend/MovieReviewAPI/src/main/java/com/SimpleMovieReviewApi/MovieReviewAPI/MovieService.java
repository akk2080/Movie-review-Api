package com.SimpleMovieReviewApi.MovieReviewAPI;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }
}
