import com.maven.ssm.dao.ZycDao;
import com.maven.ssm.model.Zyc;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zyc on 2020/7/14.
 */
public class TestDao {


   @Test
   public void testGetUserById(){
      ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
      ZycDao dao = context.getBean(ZycDao.class);
      Zyc zyc = dao.getUserById(70004);
      System.out.println(zyc.getName());
   }
}
