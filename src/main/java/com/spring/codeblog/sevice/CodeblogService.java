package com.spring.codeblog.sevice;

import com.spring.codeblog.model.Post;


import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
