package com.hyungjun.typie.controller;

import com.hyungjun.typie.domain.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/return/string")
    @ResponseBody
    public String homeString() {
        return "home";
    }

    @RequestMapping(path = "/return/json")
    @ResponseBody
    public Post homeJson() {
        Post post = new Post();

        post.title = "this is title";
        post.content = "blabla~";
        post.tags.add("tag1");
        post.tags.add("tag2");

        return post;
    }
}
