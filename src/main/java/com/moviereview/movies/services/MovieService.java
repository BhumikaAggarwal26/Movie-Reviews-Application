package com.moviereview.movies.services;

import com.moviereview.movies.model.Movie;
import com.moviereview.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired     // to let framework instantiate this class for us (as it is an interface)
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(String imdbId){  // if no movie of that id found -> null
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
