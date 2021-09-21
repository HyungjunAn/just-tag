package com.hyungjun.justtag.service;

import com.hyungjun.justtag.domain.Memo;
import com.hyungjun.justtag.repository.MemoRepository;
import com.hyungjun.justtag.repository.MemoryMemoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemoService {

    private MemoRepository memoRepository;

    public MemoService() {
        memoRepository = new MemoryMemoRepository();
    }

    public ArrayList<Memo> findAll() {
        return memoRepository.findAll();
    }

    public int insert(Memo memo) {
        return memoRepository.insert(memo);
    }
}
