package com.SimpleMovieReviewApi.MovieReviewAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    private ObjectId id;
    private String body;
//    private LocalDateTime created;
//    private LocalDateTime updated;


    public Review(String reviewBody) {
        this.body = reviewBody;
    }
}
