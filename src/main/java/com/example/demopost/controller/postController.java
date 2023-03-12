package com.example.demopost.controller;

import com.example.demopost.model.Post;
import com.example.demopost.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class postController {
    @Autowired
    postService postservice;

    @PostMapping("/add-post")
    public String addPost(@RequestBody Post post){
        postservice.addPost(post);
        return "post saved";
    }

    @GetMapping("all-post")
    public List<Post> allPost(){
        return postservice.allPost();
    }
}
