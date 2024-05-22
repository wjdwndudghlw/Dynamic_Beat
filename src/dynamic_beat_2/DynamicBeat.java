package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import com.sun.tools.javac.Main;


public class DynamicBeat extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;
    private Image introBackground;

    public DynamicBeat() {
        setTitle("Dynamic Beat");
        setSize(dynamic_beat_1.Main.SCREENT_WIDTH, dynamic_beat_1.Main.SCREENT_HEIGHT);
        setResizable(false); // 인위적으로 줄이기 X
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        
        // introBackground = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage(); 
        introBackground = new ImageIcon(Main.class.getClassLoader().getResource("images/introBackgroundTitle.jpg")).getImage();

    }

    //JFrame 을 상속받은 jUNIT 게임에서 가장 첫번째로 실행되는 메소드이다. 
    public void paint(Graphics g) {
        screenImage = createImage(dynamic_beat_1.Main.SCREENT_WIDTH, dynamic_beat_1.Main.SCREENT_HEIGHT); // 1280, 720 크기를 담겠다.
        screenGraphic = screenImage.getGraphics();
        screentDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    public void screentDraw(Graphics g) {
        g.drawImage(introBackground, 0, 0, null);
        this.repaint();
    }
}