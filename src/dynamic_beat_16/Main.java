package dynamic_beat_16;


public class Main {

    // 상수는 대문자로 표기
    public static final int SCREENT_WIDTH = 1280;
    public static final int SCREENT_HEIGHT = 720;
    public static final int NOTE_SPEED = 5;
    public static final int SLEEP_SPEED = 10;
    public static final int REACH_TIME = 2;  //비트가 위에서 밑까지 도달하는데 걸리는 시간

    public static void main(String[] args) {
        new DynamicBeat();
        
    }
}
