package spring20aopxuqiu;

public class KanDianYing implements PaiDui2{
    //次要业务
    public void paiHao(){
        System.out.println("看电影之前  需要排号（这个是次要业务）");
    }

    //主要业务
    public void kanDianYing(){
        System.out.println("在影院看哆啦A梦 （这个是主要业务）");
    }
}
