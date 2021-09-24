package com.hyungjun.typie.repository;

import com.hyungjun.typie.domain.Post;

import java.util.ArrayList;

public class MemoryPostRepository implements PostRepository {
    private ArrayList<Post> posts;
    private int curId;

    public MemoryPostRepository() {
        posts = new ArrayList<Post>();
        curId = 0;
    }

    @Override
    public int insert(Post post) {
        curId++;
        Post tmpPost = post;
        tmpPost.id = curId;
        posts.add(tmpPost);

        return curId;
    }

    @Override
    public boolean delete(int id) {
        return posts.removeIf(m -> m.id == id);
    }

    @Override
    public ArrayList<Post> findTag(ArrayList<String> tags) {
        return null;
    }

    @Override
    public ArrayList<Post> findStr(String str) {
        return null;
    }

    @Override
    public ArrayList<Post> findAll() {
        return posts;
    }
}
