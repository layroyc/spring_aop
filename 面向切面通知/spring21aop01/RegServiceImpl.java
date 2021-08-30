package spring21aop01;

public class RegServiceImpl implements RegService {
    @Override
    public void addUser() {
        System.out.println("调用 dao层   这个是  会员注册功能");
        //注册完毕后，应当给顾客发送一个短信通知， 提示 您已经注册了什么什么
        //订单.....消费.....违规.....短信通知

    }

    @Override
    public void loginUser() {
        int i=9/0;
        System.out.println("登陆之前先查看");
    }

    @Override
    public void transMoney() {
        System.out.println("转账......");
    }
}
