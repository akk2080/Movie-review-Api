package com.SimpleMovieReviewApi.MovieReviewAPI;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.getAll(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id){
//
//        return new ResponseEntity<Optional<Movie>>(movieService.getById(id), HttpStatus.OK);
//
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String id){

        return new ResponseEntity<Optional<Movie>>(movieService.getByImdbId(id), HttpStatus.OK);

    }

}
