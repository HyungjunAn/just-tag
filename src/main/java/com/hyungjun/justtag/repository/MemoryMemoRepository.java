package com.hyungjun.justtag.repository;

import com.hyungjun.justtag.domain.Memo;

import java.util.ArrayList;

public class MemoryMemoRepository implements MemoRepository {
    private ArrayList<Memo> memos;
    private int curId;

    public MemoryMemoRepository() {
        memos = new ArrayList<Memo>();
        curId = 0;
    }

    @Override
    public int insert(Memo memo) {
        curId++;
        Memo tmpMemo = memo;
        tmpMemo.id = curId;
        memos.add(tmpMemo);

        return curId;
    }

    @Override
    public boolean delete(int id) {
        return memos.removeIf(m -> m.id == id);
    }

    @Override
    public ArrayList<Memo> findTag(ArrayList<String> tags) {
        return null;
    }

    @Override
    public ArrayList<Memo> findStr(String str) {
        return null;
    }

    @Override
    public ArrayList<Memo> findAll() {
        return memos;
    }
}
