package test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBeanTest {
    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("testbean.xml");

        TestBean testBean = applicationContext.getBean("testBean", TestBean.class);
        testBean.sayName();

        TestBean testBean1 = applicationContext.getBean("testBean1", TestBean.class);
        testBean1.sayName();

        TestBean testBean2 = applicationContext.getBean("testBeanFactory", TestBean.class);
        testBean2.sayName();

        TestBean testBean3 = applicationContext.getBean("testBeanFactoryWithArg", TestBean.class);
        testBean3.sayName();
    }
}