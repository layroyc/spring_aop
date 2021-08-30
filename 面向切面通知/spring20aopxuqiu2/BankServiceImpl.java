package spring20aopxuqiu2;
//经过上述的推论  静态方法和接口都被推翻掉了。。。。
//把 排队 的这个 方法 应该 提取成一个类（对象） 这个对象就是切面，那么就是面向切面编程
//主要业务类
public class BankServiceImpl implements BankService {
    public void cunKuan(){
        System.out.println("办理银行存款业务（这个是主要业务）");
    }

    public void quKuan(){
        System.out.println("办理银行取款业务（这个是主要业务）");
    }

}
