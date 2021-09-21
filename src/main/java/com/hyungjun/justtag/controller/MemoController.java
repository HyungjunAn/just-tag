package com.hyungjun.justtag.controller;

import com.hyungjun.justtag.domain.Memo;
import com.hyungjun.justtag.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MemoController {

    private MemoService memoService;

    public MemoController() {
        memoService = new MemoService();
    }

    @RequestMapping("memos/new")
    @ResponseBody
    public int insertMemo() {
        Memo memo = new Memo();

        memo.title = "this is title!";
        memo.content = "this is content";

        return memoService.insert(memo);
    }

    @RequestMapping("memos/")
    @ResponseBody
    public ArrayList<Memo> getAll() {
        return memoService.findAll();
    }
}
