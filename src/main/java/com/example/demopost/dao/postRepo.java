package com.example.demopost.dao;

import com.example.demopost.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface postRepo extends JpaRepository<Post,Integer> {
}
