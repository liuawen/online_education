package ioc.xml;

import com.test.ioc.xml.Deliverable;
import com.test.ioc.xml.Order;
import com.test.ioc.xml.Speakable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-01-14 10:10 AM
 */

/**
 * 测试XML方式的IoC
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-chapter2.xml")
public class OrderTest {
    //Spring 容器注入依赖的Deliverable对象
    @Autowired
    private Deliverable deliverable;

    @Test
    public void test(){
        deliverable.delivery();
        System.out.println();
        System.out.println(deliverable.toString());
    }
}
