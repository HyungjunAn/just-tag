package com.hyungjun.typie.repository;

import com.hyungjun.typie.domain.Memo;

import java.util.ArrayList;

public interface MemoRepository {
    int insert(Memo memo);
    boolean delete(int id);
    ArrayList<Memo> findTag(ArrayList<String> tags);
    ArrayList<Memo> findStr(String str);
    ArrayList<Memo> findAll();
}
