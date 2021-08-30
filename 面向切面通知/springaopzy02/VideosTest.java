package springaopzy02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用Junit注解
@ContextConfiguration(locations = "classpath:springaopzy02/applicationContext.xml")
public class VideosTest {
    @Autowired
    private VideosService videosService;
    @Test
    public void vsTest(){
        //videosService.record();
        //videosService.stop();
        videosService.turncords();
    }

}
