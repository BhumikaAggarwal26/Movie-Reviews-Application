package com.moviereview.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")   // Application has the ability to create new collection by itself (no need to create manually)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {

    @Id
    private ObjectId id;
    private String body;

    public Reviews(String body) {
        this.body = body;
    }
}
