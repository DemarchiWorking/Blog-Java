package com.java.blog.service;


import com.java.blog.model.Post;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
