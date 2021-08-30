package spring20aopxuqiu;

public class Bank implements PaiDui2{
    /*//次要业务
    public void paiHao(){
        System.out.println("办理银行业务之前  需要排号（这个是次要业务）");
    }*/

    //次要业务
    public void paiHao(){
        System.out.println("办理银行业务之前  需要排号（这个是次要业务）");
    }
    //主要业务
    public void kaiHu(){
        System.out.println("办理银行开户业务（这个是主要业务）");
    }
    //主要业务
    public void xiaoHu(){
        System.out.println("办理银行销户业务（这个是主要业务）");
    }
    //主要业务
    public void cunKuan(){
        System.out.println("办理银行存款业务（这个是主要业务）");
    }
    //主要业务
    public void quKuan(){
        System.out.println("办理银行取款业务（这个是主要业务）");
    }
}
