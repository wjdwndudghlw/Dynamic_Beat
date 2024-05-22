package dynamic_beat_4;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.tools.javac.Main;

public class DynamicBeat extends JFrame {
    private Image screenImage;
    private Graphics screenGraphic;
    private ImageIcon exitButtonBasicImage = new ImageIcon(
            Main.class.getClassLoader().getResource("images/exitButtonBasic.png"));
    private ImageIcon exitButtonEnteredImage = new ImageIcon(
            Main.class.getClassLoader().getResource("images/exitButtonEntered.png"));
    private Image introBackground = new ImageIcon(
            Main.class.getClassLoader().getResource("images/introBackgroundTitle.jpg")).getImage();
    private JLabel menubar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/menuBar.png")));
    private JButton exitButton = new JButton(exitButtonBasicImage);
    private int mouseX, mouseY;

    public DynamicBeat() {
        setUndecorated(true);
        setTitle("Dynamic Beat");
        setSize(dynamic_beat_1.Main.SCREENT_WIDTH, dynamic_beat_1.Main.SCREENT_HEIGHT);
        setResizable(false); // 인위적으로 줄이기 X
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(new Color(0, 0, 0, 0));
        setLayout(null);

        exitButton.setBounds(1245, 0, 30, 30);
        exitButton.setBorderPainted(false); // 테두리 그리지 X
        exitButton.setContentAreaFilled(false); // 컨텐츠 외 나머지 배경은 기본 배경으로 하겠다.
        exitButton.setFocusPainted(false); // 버튼이 포커스 되었을 떄 나타나는 점선 효과 없애겠다.
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                exitButton.setIcon(exitButtonEnteredImage);
                exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
                buttonEnteredMusic.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitButton.setIcon(exitButtonBasicImage);
                exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
                buttonEnteredMusic.start();
                System.exit(0);
            }
        });

        add(exitButton);

        menubar.setBounds(0, 0, 1280, 30);
        menubar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        menubar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                System.out.println("x:" + x + " y:" + y + " and mouseX:" + mouseX + " mouseY:" + mouseY); // 확인용
                setLocation(x - mouseX, y - mouseY);
            }
        });
        add(menubar);

        // introBackground = new
        // ImageIcon(Main.class.getResource("introBackground.jpg")).getImage();

        Music introMusic = new Music("IntroMusic.mp3", true);
        introMusic.start();
    }

    // JFrame 을 상속받은 jUNIT 게임에서 가장 첫번째로 실행되는 메소드이다.
    public void paint(Graphics g) {
        screenImage = createImage(dynamic_beat_1.Main.SCREENT_WIDTH, dynamic_beat_1.Main.SCREENT_HEIGHT); // 1280, 720
                                                                                                          // 크기를 담겠다.
        screenGraphic = screenImage.getGraphics();
        screentDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    public void screentDraw(Graphics g) {
        g.drawImage(introBackground, 0, 0, null); // 그래픽스 객체에 직접 이미지를 랜더링 한다.
        paintComponents(g); // 라벨 같은곳을 어디어디 위치에 놓겠다
        this.repaint();
    }
}