package com.core.util;

import com.core.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yonghuo.chen on 17/6/22.
 */
public class GetGoodId {
    @Autowired
    private GoodService goodService;
    public String  getGoodIdByAsin(String asin){
        String  goodId=goodService.findGoodIdByAsin(asin);
        return goodId;
    }
}
