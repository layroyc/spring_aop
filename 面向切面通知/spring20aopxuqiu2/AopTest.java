package spring20aopxuqiu2;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class AopTest {
    @Test
    public void test01(){
        //排队
        //存取款
        /*PaiHao ph = new PaiHao();//次要业务  不应该出现在这个方法中！！！ 那么应该怎么实现排号这个方法呢？
        ph.paiHao();*/
        BankServiceImpl bank = new BankServiceImpl();//主要业务
        bank.cunKuan();
        bank.quKuan();

        //问题
        /*
        * 次要业务  不应该出现在这个方法中  那么我们该怎么实现排号这个方法呢？
        * 即：如何让 Bank类  在不改变源代码的基础上  添加这个排队的方法  排号呢？
        * dao  service
        * */
    }

    @Test
    //使用动态代理解决  切面类+主要业务  组合在一起
    public void test02(){
        //排队
        //存取款
        //1.目标对象
       BankService target = new BankServiceImpl();
       //2.代理对象
        BankService bankService = (BankService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        //在这里  可以增强对象i  其实就是 直接把切面类直接拿过来就可以了
                        PaiHao.paiHao();
                        Object result = method.invoke(target, objects);
                        return result;
                    }
                }
        );
        bankService.cunKuan();
        bankService.quKuan();
    }
}
