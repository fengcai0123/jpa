package com.core.service.impl;

import com.core.entity.Bsr;
import com.core.repository.BsrRepository;
import com.core.service.BsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@Service
public class BsrServiceImpl implements BsrService {
    @Autowired
    private BsrRepository bsrRepository;
    @Override
    public Bsr insert(Bsr bsr) {
        return bsrRepository.save(bsr);
    }

    @Override
    public List<Bsr> findBsrByGoodId(int goodId) {
        List<Bsr> bsrList=bsrRepository.selectAllByGoodId(goodId);
        return bsrList;
    }

    @Override
    public List<Bsr> findAll() {
        return bsrRepository.findAll();
    }
}
