package springaopzy01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VideoTest {
    @Test
    public void test01(){
        String xml = "springaopzy01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        VideoService videoService = ac.getBean("videoService", VideoService.class);
        videoService.record();
        System.out.println("------后--------");
        videoService.stop();
        System.out.println("------环绕--------");
        videoService.turncords();
    }
}
