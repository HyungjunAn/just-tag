package com.hyungjun.typie.controller;

import com.hyungjun.typie.domain.Post;
import com.hyungjun.typie.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    private PostService postService;

    public PostController() {
        postService = new PostService();
    }

    @RequestMapping("posts/new")
    public String insertPost(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content) {
        Post post = new Post();

        post.title = title;
        post.content = content;

        postService.insert(post);

        return "redirect:/";
    }

    @RequestMapping("posts/")
    @ResponseBody
    public ArrayList<Post> getAll() {
        return postService.findAll();
    }
}
