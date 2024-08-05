package com.SimpleMovieReviewApi.MovieReviewAPI;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> getByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
