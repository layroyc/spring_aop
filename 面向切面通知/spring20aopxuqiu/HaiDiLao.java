package spring20aopxuqiu;

public class HaiDiLao implements PaiDui2 {
    //次要业务
    /*public void paiHao(){
        System.out.println("办理吃饭业务之前  需要排号（这个是次要业务）");
    }*/

    //次要业务
    public void paiHao(){
        System.out.println("办理吃饭业务之前  需要排号（这个是次要业务）");
    }

    //主要业务
    public void ganHuoGuo(){
        System.out.println("在海底捞 吃火锅 （这个是主要业务）");
    }
}
