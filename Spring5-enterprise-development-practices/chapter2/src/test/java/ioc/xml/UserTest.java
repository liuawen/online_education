package ioc.xml;

import com.test.ioc.xml.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-01-14 9:47 AM
 */
public class UserTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-chapter2.xml");
        User user = (User) context.getBean("user");
        user.say();
        user.showName();
    }
}
