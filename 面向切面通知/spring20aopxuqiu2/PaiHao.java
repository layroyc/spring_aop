package spring20aopxuqiu2;
/**
 * 这个类 就是 切面类  切面类 和 普通类的区别是什么？
 * 1.逻辑上的区别？  切面类是次要业务，而普通类可能是 主要业务
 * 2.写法上的区别？    一般切面类 里面很少有属性只有方法
 *
 *
 * //讲到这里  我们要晋级   切面类 就是 通知
 * //
 */

public class PaiHao {
    public static void paiHao(){
        System.out.println("我就是排号");
    }
}
