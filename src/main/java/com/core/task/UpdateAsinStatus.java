package com.core.task;

import com.core.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/22.
 */
@Component
public class UpdateAsinStatus {
    /*@Autowired
    private GoodService goodService;
    @Scheduled(cron = "0/30 * * * * ?")
    public void test(){
        System.out.println("定时任务开始啦，哈哈哈,把原来状态AsinStatus=1的改为AsinStatus=2");
        List<String> asinList=goodService.findAsinByAsinStatus(1);
        if(asinList.size()>0){

        }
        System.out.println("<<<---------结束执行HR数据同步任务--------->>>");
    }*/
}
