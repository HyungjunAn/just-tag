package com.hyungjun.typie.controller;

import com.hyungjun.typie.domain.Memo;
import com.hyungjun.typie.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MemoController {

    private MemoService memoService;

    public MemoController() {
        memoService = new MemoService();
    }

    @RequestMapping("memos/new")
    public String insertMemo(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content) {
        Memo memo = new Memo();

        memo.title = title;
        memo.content = content;

        memoService.insert(memo);

        return "redirect:/";
    }

    @RequestMapping("memos/")
    @ResponseBody
    public ArrayList<Memo> getAll() {
        return memoService.findAll();
    }
}
