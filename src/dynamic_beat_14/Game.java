package dynamic_beat_14;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.ImageIcon;

public class Game extends Thread { // 스레드란 하나의 프로세스 내에서 사용가능한 경량 프로그램 
        private Image GameInfoImage = new ImageIcon(
                        Main.class.getResource("../images/GameInfo.png")).getImage();
        private Image JudgementLineImage = new ImageIcon(
                        Main.class.getResource("../images/JudgementLine.png")).getImage();

        private Image NoteRouteSImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteDImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteFImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteSpace1Image = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteSpace2Image = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteJImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteKImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();
        private Image NoteRouteLImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRoute.png")).getImage();

        private Image NoteRouteLineImage = new ImageIcon(
                        Main.class.getResource("../images/NoteRouteLine.png")).getImage();

        ArrayList<Note> noteList = new ArrayList<Note>(); // 노트를 리스트로 관리

        Image KeyPressImage[] = {
                        NoteRouteSImage,
                        NoteRouteDImage,
                        NoteRouteFImage,
                        NoteRouteSpace1Image,
                        NoteRouteSpace2Image,
                        NoteRouteJImage,
                        NoteRouteKImage,
                        NoteRouteLImage
        };
        Map<String, Integer> TempDict = Map.of(
                        "S", 0,
                        "D", 1,
                        "F", 2,
                        "SPACE1", 3,
                        "SPACE2", 4,
                        "J", 5,
                        "K", 6,
                        "L", 7);
                        
        private String titleName;
        private String difficultly;
        private String musicTitle;
        private Music gameMusic;

        public Game(String titleName, String difficultly, String musicTitle) {
                this.titleName = titleName;
                this.difficultly = difficultly;
                this.musicTitle = musicTitle;
                System.out.println("musicTitle:"+musicTitle);
                gameMusic = new Music(musicTitle, false);
        }

        public void screenDraw(Graphics2D g) {
                // System.out.println("Game 클래스 screenDraw 메소드");
                g.drawImage(KeyPressImage[0], 228, 30, null);
                g.drawImage(KeyPressImage[1], 332, 30, null);
                g.drawImage(KeyPressImage[2], 436, 30, null);
                g.drawImage(KeyPressImage[3], 540, 30, null);
                g.drawImage(KeyPressImage[4], 644, 30, null);
                g.drawImage(KeyPressImage[5], 748, 30, null);
                g.drawImage(KeyPressImage[6], 848, 30, null);
                g.drawImage(KeyPressImage[7], 952, 30, null);

                g.drawImage(NoteRouteLineImage, 224, 30, null);
                g.drawImage(NoteRouteLineImage, 328, 30, null);
                g.drawImage(NoteRouteLineImage, 432, 30, null);
                g.drawImage(NoteRouteLineImage, 536, 30, null);
                g.drawImage(NoteRouteLineImage, 740, 30, null);
                g.drawImage(NoteRouteLineImage, 844, 30, null);
                g.drawImage(NoteRouteLineImage, 948, 30, null);
                g.drawImage(GameInfoImage, 0, 660, null);
                g.drawImage(JudgementLineImage, 0, 580, null);

                for (int i = 0; i < noteList.size(); i++) {
                        Note note = noteList.get(i);
                        note.screenDraw(g);
                }
                g.setColor(Color.white);
                g.setFont(new Font("굴림", Font.BOLD, 30));
                g.setFont(new Font("Arial", Font.PLAIN, 26));
                g.drawString(difficultly, 1190, 702);
                g.drawString(titleName, 20, 702);
                g.setColor(Color.DARK_GRAY);
                g.drawString("S", 270, 609);
                g.drawString("D", 374, 609);
                g.drawString("F", 478, 609);
                g.drawString("Space Bar", 580, 609);
                g.drawString("J", 784, 609);
                g.drawString("K", 889, 609);
                g.drawString("L", 993, 609);
                g.setColor(Color.LIGHT_GRAY);
                g.setFont(new Font("Elephant", Font.BOLD, 30));
                g.drawString("000000", 565, 702);
        }

        public void Press(KeyEvent e) {
                // System.out.println("Pree 메소드");
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        KeyPressImage[3] = new ImageIcon(Main.class.getResource("../images/NoteRoutePress.PNG"))
                                        .getImage();
                        KeyPressImage[4] = new ImageIcon(Main.class.getResource("../images/NoteRoutePress.png"))
                                        .getImage();
                        new Music("drum1.mp3", false).start();
                } else {
                        String key = String.valueOf(e.getKeyChar()).toUpperCase();
                        if (TempDict.containsKey(key)) {
                                KeyPressImage[TempDict.get(key)] = new ImageIcon(
                                                Main.class.getResource("../images/NoteRoutePress.png")).getImage();
                                new Music("drum1.mp3", false).start();
                        }
                }

        }

        public void Release(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        KeyPressImage[3] = new ImageIcon(Main.class.getResource("../images/NoteRoute.PNG"))
                                        .getImage();
                        KeyPressImage[4] = new ImageIcon(Main.class.getResource("../images/NoteRoute.png"))
                                        .getImage();
                } else {
                        String key = String.valueOf(e.getKeyChar()).toUpperCase();
                        if (TempDict.containsKey(key)) {
                                KeyPressImage[TempDict.get(key)] = new ImageIcon(
                                                Main.class.getResource("../images/NoteRoute.png")).getImage();
                        }
                }

        }
        public void close(){
                this.gameMusic.close(); // 게임 음악 종료
                this.interrupt(); // 게임 스레드 종료 신호 전달 -> 실제 스레드를 종료하는 건 다른 곳에서 진행 
        }


        public void dropNotes() {
                Beat[] beats = null;
                if (titleName.equals("Joakim Karud - Mighty Love")) {
                        int startTime = 1000 - Main.REACH_TIME * 1000;
                        System.out.println("Game 클래스 내 startTime: "+ startTime);
                        int gap = 125;
                        gap = 545; //bpm 110 기준
                        beats = new Beat[] {
                            new Beat(startTime, "S"),
                            new Beat(startTime + gap * 1, "D"),
                            new Beat(startTime + gap * 2, "S"),
                            new Beat(startTime + gap * 3, "D"),
                            new Beat(startTime + gap * 4, "S"),
                            new Beat(startTime + gap * 5, "D"),
                            new Beat(startTime + gap * 6, "S"),
                            new Beat(startTime + gap * 7, "D"),
                            new Beat(startTime + gap * 8, "J"),
                            new Beat(startTime + gap * 9, "K"),
                            new Beat(startTime + gap * 10, "J"),
                            new Beat(startTime + gap * 11, "K"),
                            new Beat(startTime + gap * 12, "J"),
                            new Beat(startTime + gap * 13, "K"),
                            new Beat(startTime + gap * 14, "J"),
                            new Beat(startTime + gap * 15, "K"),
                            new Beat(startTime + gap * 16, "S"),
                            new Beat(startTime + gap * 17, "D"),
                            new Beat(startTime + gap * 18, "S"),
                            new Beat(startTime + gap * 19, "D"),
                            new Beat(startTime + gap * 20, "S"),
                            new Beat(startTime + gap * 21, "D"),
                            new Beat(startTime + gap * 22, "J"),
                            new Beat(startTime + gap * 23, "K"),
                            new Beat(startTime + gap * 24, "L"),
                            new Beat(startTime + gap * 25, "F"),
                            new Beat(startTime + gap * 26, "Space"),
                            new Beat(startTime + gap * 27, "J")



                        //     new Beat(startTime + gap * 2, "D"),
                        //     new Beat(startTime + gap * 4, "S"),
                        //     new Beat(startTime + gap * 6, "D"),
                        //     new Beat(startTime + gap * 8, "S"),
                        //     new Beat(startTime + gap * 10, "D"),
                        //     new Beat(startTime + gap * 12, "S"),
                        //     new Beat(startTime + gap * 14, "D"),
                        //     new Beat(startTime + gap * 18, "J"),
                        //     new Beat(startTime + gap * 20, "K"),
                        //     new Beat(startTime + gap * 22, "J"),
                        //     new Beat(startTime + gap * 24, "K"),
                        //     new Beat(startTime + gap * 26, "J"),
                        //     new Beat(startTime + gap * 28, "K"),
                        //     new Beat(startTime + gap * 30, "J"),
                        //     new Beat(startTime + gap * 32, "K"),
                        //     new Beat(startTime + gap * 36, "S"),
                        //     new Beat(startTime + gap * 38, "D"),
                        //     new Beat(startTime + gap * 40, "S"),
                        //     new Beat(startTime + gap * 42, "D"),
                        //     new Beat(startTime + gap * 44, "S"),
                        //     new Beat(startTime + gap * 46, "D"),
                        //     new Beat(startTime + gap * 48, "J"),
                        //     new Beat(startTime + gap * 49, "K"),
                        //     new Beat(startTime + gap * 50, "L"),
                        //     new Beat(startTime + gap * 52, "F"),
                        //     new Beat(startTime + gap * 52, "Space"),
                        //     new Beat(startTime + gap * 52, "J")
                            
                        };

                } else if (titleName.equals("Joakim Karud - Wild Flower")) {
                    int startTime = 1000;
                    beats = new Beat[] {
                        new Beat(startTime, "Space"),
                    };
                } else if (titleName.equals("Bendsound - Energy")) {
                    int startTime = 1000;
                    beats = new Beat[] {
                        new Beat(startTime, "Space"),
                    };
                }
                gameMusic.start();
                int i = 0;
                while (i < beats.length  && !interrupted()) {
                        boolean dropped = false;
                        if(beats[i].getTime() <= gameMusic.getTime()){  // 내려오는 비트가 현재 실행되는 음악과 맞춰서 내려오기 위해
                                System.out.println("Game 클래스 내 211번줄 beats[i].getTime():"+beats[i].getTime() );
                                System.out.println("Game 클래스 내 211번줄 gameMusic.getTime():"+gameMusic.getTime() );
                                Note note = new Note(beats[i].getNoteName());
                                note.start();
                                noteList.add(note);
                                i++;
                                dropped = true;
                        }
                        if (!dropped){
                                try {
                                        // System.out.println("Game 클래스 내 217번 줄 !dropped 조건문");
                                        Thread.sleep(5);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                }
            }
            
        @Override
        public void run() {
                dropNotes();
        }

}
