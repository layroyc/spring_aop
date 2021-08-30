package spring21aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegTest {
    //测试目的：把 msg的切面  次要业务 融合到 主要业务 reg 去

    //xml版
   //后置通知
    @Test
    public void test01(){
        String xml = "spring21aop01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        RegService regService = ac.getBean("regService", RegService.class);
        regService.addUser();
        System.out.println("---------------------");
        regService.loginUser();
        System.out.println("---------------------");
        //int i=9/0;  必须要写在主体业务中
        regService.transMoney();

    }
}
