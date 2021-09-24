package com.hyungjun.typie.service;

import com.hyungjun.typie.domain.Post;
import com.hyungjun.typie.repository.PostRepository;
import com.hyungjun.typie.repository.MemoryPostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService() {
        postRepository = new MemoryPostRepository();
    }

    public ArrayList<Post> findAll() {
        return postRepository.findAll();
    }

    public int insert(Post post) {
        return postRepository.insert(post);
    }
}
