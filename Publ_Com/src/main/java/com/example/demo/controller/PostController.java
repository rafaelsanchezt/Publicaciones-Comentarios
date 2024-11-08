package com.example.demo.controller;

import com.example.demo.model.post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    // Endpoint para probar la base de datos
    @GetMapping("/test")
    public String testMongoConnection() {
        post post = new post();
        post.setTitle("Test Post");
        post.setContent("Este es un post de prueba.");
        postRepository.save(post);
        return "Post guardado con ID: " + post.getId();
    }

    // Endpoint para crear un post
    @PostMapping("/create")
    public post createPost(@RequestBody post post) {
        return postRepository.save(post);
    }
}
