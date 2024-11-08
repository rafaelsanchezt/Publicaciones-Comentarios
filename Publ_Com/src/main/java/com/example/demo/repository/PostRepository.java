package com.example.demo.repository;

import com.example.demo.model.post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<post, String> {
}