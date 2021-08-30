package spring22aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面    日志类
@Component("logAspect")
@Aspect
public class LogAspect {
    @Pointcut("execution(* spring22aop02.*.*(..))")
    public void pt(){
        System.out.println("切入点表达式");
    }

    @Before("pt()")
    public void beforeMsg(){
        System.out.println("前置通知.......");
    }

    @AfterReturning("pt()")
    public void AfterMsg(){
        System.out.println("后置通知.......");
    }

   /* @Around("pt()")
    public void AroundMsg(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知.......前面");
        try {
            Object proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知.......后面");
    }*/

    @AfterThrowing(value = "pt()",throwing = "e")
    public void throwing(JoinPoint joinPoint,Exception e){
        System.out.println("异常通知"+e.getMessage());
    }

    @After("pt()")
    public void afterFinally(){
        System.out.println("最终的通知");
    }
}
