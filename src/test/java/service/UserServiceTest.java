package service;

import com.core.entity.User;
import com.core.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by yonghuo.chen on 16/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class UserServiceTest  {

    @Autowired
    private UserService userService;

    @Test
    public void testFindOneServiceTest(){
        // List<Goods> goodsList=goodsService.findListByCateId(2);
        User user =   userService.getUser( 85);
            System.out.println("测试userServiceImpl getUser:" +user.getUsername());

    }
    @Test
    public void testGoodsServiceTest(){
        // List<Goods> goodsList=goodsService.findListByCateId(2);
        List<User> userList=userService.findAll();
        for(int i=0;i<userList.size();i++) {
            User user=userList.get(i);
            System.out.println("测试userServiceImpl:" +user.getUsername()+"  id="+user.getId());
        }
    }

   /* private ApplicationContext ctx=null;
    {

        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource=ctx.getBean(DataSource.class);
        System.out.print(dataSource.getConnection());
    }*/


    @Test
    public void findAll(){

//        User user= userService.findOneByUsername("18659506072");
//        System.out.println("用户名:  "+user.getMobile());
        /*for(User user:userList) {
            System.out.println("用户名:  "+user.getMobile());
        }*/
    }

}
