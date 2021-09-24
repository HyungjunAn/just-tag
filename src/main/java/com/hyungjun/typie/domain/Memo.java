package com.hyungjun.typie.domain;

import java.util.ArrayList;

public class Memo {
    public String title;
    public String content;
    public ArrayList<String> tags;
    public int id;

    public Memo() {
        this.title = "";
        this.content = "";
        this.tags = new ArrayList<String>();
        this.id = 0;
    }
}