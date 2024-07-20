package com.moviereview.movies.repository;

import com.moviereview.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {  // connects to DB and brings data by ID(built in method)

    Optional<Movie> findMovieByImdbId(String imdbId);  //just writing this, spring data mongodb will automatically know via which id we need to search
}
