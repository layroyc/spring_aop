package springaopzy02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面类
@Component("vAspect")
@Aspect
public class VAspect {
    @Pointcut("execution(* springaopzy02.*.*(..))")
    public void vd(){
        System.out.println("开始播放啦");
    }
    /*@Before("vd()")
    public void beforeMsg(){
        System.out.println("前置通知");
        System.out.println("插播广告！！！");
    }*/

    @AfterReturning("vd()")
    public void AfterMsg(){
        System.out.println("后置通知");
        System.out.println("亲, 办理会员可以看vip哦");
    }

    /*@Around("vd()")
    public void roundMsg(ProceedingJoinPoint pj){
        //上面的
        System.out.println("验证一下");
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //下面的
        System.out.println("转账成功");
    }*/

    @AfterThrowing(value = "vd()",throwing = "e")
    public void throwing(JoinPoint joinPoint,Exception e){
        System.out.println("视频已失踪,推荐您看其他同类视频");
    }

    @After("vd()")
    public void afterAll(){
        System.out.println("异常信息已发送至管理员的邮箱 ");
    }

}
