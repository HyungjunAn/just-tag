package com.hyungjun.typie.domain;

import java.util.ArrayList;

public class Post {
    public String title;
    public String content;
    public ArrayList<String> tags;
    public int id;

    public Post() {
        this.title = "";
        this.content = "";
        this.tags = new ArrayList<String>();
        this.id = 0;
    }
}