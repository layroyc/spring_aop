package spring21aop01;

public interface RegService {
    //注册一个公司
    public void addUser();//切入点  spring21aop01.RegService.addUser
    //登录的时候，登录之前先查看
    public void loginUser();

    //转账
    public void transMoney();

}
