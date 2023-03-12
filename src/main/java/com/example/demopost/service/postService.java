package com.example.demopost.service;

import com.example.demopost.dao.postRepo;
import com.example.demopost.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class postService {

    @Autowired
    postRepo postrepo;
    public void addPost(Post post) {
        postrepo.save(post);
    }

    public List<Post> allPost() {
        return postrepo.findAll();
    }
}
