package dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yonghuo.chen on 16/10/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class PagerTest {
   /* @Autowired
    private BaseDao<Goods> baseDao;
    private int currentPage;
    private int pageTotal;
    private int currentRows;//当前页记录数
    private int rowTotal;

@Test
@Transactional
  public  void testQueryAll(){
  *//*  String sql=" from Goods g where g.id < 100";
    List<Goods> goodsList=baseDao.find(sql);
    for(int i=0;i<goodsList.size();i++) {
        Goods goods1= goodsList.get(i);
        System.out.print("产品名称" +goods1.getName()+"\n");
    }*//*
  }
    *//*@Test
    public void testQueryPager(){
        Pager pager=goodsDao.findByPager(String sql ,String entityName, int startPage, int pageSize);

    }*/
}
