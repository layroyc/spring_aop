package springaopzy02;

import org.springframework.stereotype.Service;

@Service("videosService")
public class VideosServiceImpl implements VideosService {
    @Override
    public void record() {
        System.out.println("播放");
    }

    @Override
    public void stop() {
        System.out.println("暂停");
    }

    @Override
    public void turncords() {
        int i =66/0;
        System.out.println("转金币");
    }
}
