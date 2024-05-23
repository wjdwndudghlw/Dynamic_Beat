package dynamic_beat_9;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player; // jl 라이브러리: 음악 관련 라이브러리

public class Music extends Thread {
    private Player player;
    private boolean isLoop;
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    public Music(String Name, boolean isLoop) {
        try {
            this.isLoop = isLoop;

            file = new File(Main.class.getClassLoader().getResource("music/" + Name).toURI()); // getClassLoader: Main 클래스의 루트 디렉토리 즉 dynamic_beat3 에서 찾으며 상대경로 지원 X
            //file = new File(Main.class.getResource("music/" + Name).toURI()); // Main 클래스의 위치에서 찾는다

            fis = new FileInputStream(file); //파일로부터 바이트 단위로 읽어들이기 위한 스트림
            bis = new BufferedInputStream(fis); // 버퍼에 담아서 읽을 수 있도록
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getTime() {
        if (player == null) {
            return 0;
        }
        return player.getPosition();
    }

    public void close() {
        isLoop = false;
        player.close();
        this.interrupt();
    }

    @Override //Thread 상속 시 무조건 작성해야 하는 메소드
    public void run() {
        try {
            do {
                player.play();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis); // 버퍼에 담아서 읽을 수 있도록
                player = new Player(bis);
            } while (isLoop);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
