package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class CategoryDaoTest {

    /*@Autowired
    private CategoryDao categoryDao;

  *//*  @Transactional
    @Test
    public void testFindCategory(String sql){
        List<Category> categoryList =categoryDao.findCategory(" ");
        for(int i=0;i<categoryList.size();i++) {
            Category category=categoryList.get(i);
            System.out.println("测试categoryDaoImpl:" +category.getName()+"  id="+category.getId());
        }
    }*//*

    @Transactional
    @Test
    public void testFindCategoryAll(){
        List<Category> categoryList=categoryDao.findByProperties("悬挂系统");
        for(int i=0;i<categoryList.size();i++) {
            Category category=categoryList.get(i);
            System.out.println("测试categoryDaoImpl:" +category.getName()+"  id="+category.getId());
        }
    }*/
}
