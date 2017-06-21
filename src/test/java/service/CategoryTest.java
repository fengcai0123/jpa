package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yonghuo.chen on 16/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class CategoryTest {

  /*  @Autowired
    private CategoryService categoryService;

    @Transactional
    @Test
    public void testFindCategoryById(){
        Category category=categoryService.findCategoryById(5);
        if(category !=null) {
            System.out.print("分类测试:" + category.getName() + category.getId() + category.getTitle());
        }
    }

    @Transactional
    @Test
    public void testFindCategoryAll(){
        Category category=categoryService.findCategoryById(5);
        if(category !=null) {
            System.out.print("分类测试:" + category.getName() + category.getId() + category.getTitle());
        }
    }*/
}
