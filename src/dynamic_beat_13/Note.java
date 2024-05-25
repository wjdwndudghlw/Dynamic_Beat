package dynamic_beat_13;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread {

    private Image noteBasicImage = new ImageIcon(Main.class.getResource("../images/NoteBasic.png")).getImage();
    private int x, y= 580 - 1000 / Main.NOTE_SPEED * Main.SLEEP_SPEED; //1초 뒤에 y 좌표는 580 에 도달
    private String noteType;


    public Note(int x,  String noteType){
        this.x = x;
        this.noteType = noteType;
    }

    public void screenDraw(Graphics2D g){
        if(noteType.equals("short")){
            // System.out.println("Note 클래스 screenDraw 메소드");
            g.drawImage(noteBasicImage,x,y,null);
        }
        else{
            g.drawImage(noteBasicImage,x,y,null);
            g.drawImage(noteBasicImage,x+100,y,null);
        }
    }

    public void drop(){
        // System.out.println(y);
        y += Main.NOTE_SPEED;
    }

    @Override
    public void run() {
        try {
            while (true) {
                drop();
                Thread.sleep(Main.SLEEP_SPEED);
            }
        } catch (Exception e) {
           System.err.println(e.getMessage());
        }

    }
}
