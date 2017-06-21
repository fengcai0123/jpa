package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class GoodsTest {
  /*  @Autowired
    private GoodsService goodsService;
    @Test
    public void testGoodsServiceTest(){
       // List<Goods> goodsList=goodsService.findListByCateId(2);
        List<Goods> goodsList=goodsService.findAll();
        for(int i=0;i<goodsList.size();i++) {
            Goods category=goodsList.get(i);
            System.out.println("测试goodsServiceImpl:" +category.getName()+"  id="+category.getId());
        }
    }*/
}
