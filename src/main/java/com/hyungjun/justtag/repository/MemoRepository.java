package com.hyungjun.justtag.repository;

import com.hyungjun.justtag.domain.Memo;

import java.util.ArrayList;

public interface MemoRepository {
    int insert(Memo memo);
    boolean delete(int id);
    ArrayList<Memo> findTag(ArrayList<String> tags);
    ArrayList<Memo> findStr(String str);
    ArrayList<Memo> findAll();
}
