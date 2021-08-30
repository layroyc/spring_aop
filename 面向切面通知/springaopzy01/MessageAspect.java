package springaopzy01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MessageAspect {
    public void bofangMsg(){
        System.out.println("前置通知");
        System.out.println("插播广告！！！");
    }
    public void stopMsg(){
        System.out.println("后置通知");
        System.out.println("亲, 办理会员可以看vip哦");
    }
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
    }

    public void sendMsgError(JoinPoint joinPoint, Exception e){
        System.out.println("视频已失踪,推荐您看其他同类视频");

    }


    //最终的通知
    public void finallyMsg(){
        System.out.println("异常信息已发送至管理员的邮箱 ");
    }
}
