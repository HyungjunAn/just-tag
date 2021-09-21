package com.hyungjun.justtag.controller;

import com.hyungjun.justtag.domain.Memo;
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
    public Memo homeJson() {
        Memo memo = new Memo();

        memo.title = "this is title";
        memo.content = "blabla~";
        memo.tags.add("tag1");
        memo.tags.add("tag2");

        return memo;
    }
}
