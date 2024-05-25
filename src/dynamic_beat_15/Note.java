package dynamic_beat_15;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread {

    private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/NoteBasic.png")).getImage();
    private int x, y = -500 - (1000 / Main.NOTE_SPEED * Main.SLEEP_SPEED) * Main.REACH_TIME; // 1초 뒤에 y 좌표는 580 에 도달
    private String noteType;
    private boolean proceeded = true;

    public String getNoteType() {
        return noteType;
    }

    public boolean isProceeded() {
        return proceeded;
    }

    public void close() {
        proceeded = false;
    }

    public Note(String noteType) {
        if (noteType.equals("S")) {
            x = 228;
        } else if (noteType.equals("D")) {
            x = 332;
        } else if (noteType.equals("F")) {
            x = 436;
        } else if (noteType.equals("Space")) {
            x = 540;
        } else if (noteType.equals("J")) {
            x = 744;
        } else if (noteType.equals("K")) {
            x = 848;
        } else if (noteType.equals("L")) {
            x = 952;
        }
        this.noteType = noteType;
    }

    public void screenDraw(Graphics2D g) {
        if (!noteType.equals("Space")) {
            // System.out.println("Note 클래스 screenDraw 메소드");
            g.drawImage(noteBasicImage, x, y, null);
        } else {
            g.drawImage(noteBasicImage, x, y, null);
            g.drawImage(noteBasicImage, x + 100, y, null);
        }
    }

    public void drop() {
        // System.out.println(y);
        y += Main.NOTE_SPEED;
        if (y > 620) {
            System.out.println("close");
            close();
        }
    }

    public void judge() {
        if (y >= 613) {
            System.out.println("late");
            close();
        }
        else if (y >= 600) {
            System.out.println("Good");
            close();
        }
        else if (y >= 587) {
            System.out.println("Great");
            close();
        }
        else if (y >= 573) {
            System.out.println("Perpect");
            close();
        }
        else if (y >= 565) {
            System.out.println("Great");
            close();
        }
        else if (y >= 550) {
            System.out.println("Good");
            close();
        }
        else if (y >= 535) {
            System.out.println("Ealry");
            close();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                drop();
                if (proceeded) {
                    Thread.sleep(Main.SLEEP_SPEED);
                } else {                                                                                         
                    interrupt();
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
