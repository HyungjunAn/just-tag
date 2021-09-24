package com.hyungjun.typie.repository;

import com.hyungjun.typie.domain.Post;

import java.util.ArrayList;

public interface PostRepository {
    int insert(Post post);
    boolean delete(int id);
    ArrayList<Post> findTag(ArrayList<String> tags);
    ArrayList<Post> findStr(String str);
    ArrayList<Post> findAll();
}
