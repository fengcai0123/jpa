package dao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yonghuo.chen on 16/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class OrderTest {
//   @Autowired
//    private UserRepository orderGoodsDao;
   /*  @Test
    public void testFindOrderGoodsList(){
        List<OrderGoods> orderGoodsList= orderGoodsDao.selectByOrderIdAndUserId(92);
        for(int i=0;i<orderGoodsList.size();i++) {
            OrderGoods category=orderGoodsList.get(i);
            System.out.println("orderGoodsDaoTest:" +category.getGoodsName()+"  id="+category.getOrderId());
        }
    }*/

}
