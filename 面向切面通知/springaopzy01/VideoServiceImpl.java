package springaopzy01;

public class VideoServiceImpl implements VideoService {
    @Override
    public void record() {
        System.out.println("播放....");
    }

    @Override
    public void stop() {
        int i =  5/0;
        System.out.println("暂停....");
    }

    @Override
    public void turncords() {
        System.out.println("转金币....");
    }
}
