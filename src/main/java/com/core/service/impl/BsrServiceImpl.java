package com.core.service.impl;

import com.core.entity.Bsr;
import com.core.repository.BsrRepository;
import com.core.service.BsrService;
import com.core.service.GoodService;
import com.core.util.GetGoodId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/20.
 */
@Service
public class BsrServiceImpl implements BsrService {
    @Autowired
    private BsrRepository bsrRepository;
    @Autowired
    private GoodService goodService;
    @Override
    public Bsr insert(Bsr bsr) {
        return bsrRepository.save(bsr);
    }

    @Override
    @Transactional
    public void del(String asin) {
        List<Bsr> bsrList=null;
        String goodId=goodService.findGoodIdByAsin(asin);
        if(goodId!="0") {
            bsrList = bsrRepository.selectAllByGoodId(Integer.parseInt(goodId));
            if (bsrList.size() > 0) {
                bsrRepository.delete(Integer.parseInt(goodId));
            }
        }
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
