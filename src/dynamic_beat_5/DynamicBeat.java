package dynamic_beat_5;

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

// 버전1 = 원본
// public class DynamicBeat extends JFrame {

// 	private Image screenImage;
// 	private Graphics screenGraphic;

// 	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
// 	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
// 	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
// 	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
// 	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
// 	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	
	
// 	private Image background = new ImageIcon(Main.class.getResource("../images/introBackgroundTitle.jpg")).getImage();
// 	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

// 	private JButton exitButton = new JButton(exitButtonBasicImage);
// 	private JButton startButton = new JButton(startButtonBasicImage);
// 	private JButton quitButton = new JButton(quitButtonBasicImage);
	
// 	private int mouseX, mouseY;
	
// 	public DynamicBeat() {
// 		setUndecorated(true);
// 		setTitle("Dynamic Beat");
// 		setSize(dynamic_beat_5.Main.SCREENT_WIDTH, dynamic_beat_5.Main.SCREENT_HEIGHT);
// 		setResizable(false);
// 		setLocationRelativeTo(null);
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		setVisible(true);
// 		setBackground(new Color(0, 0, 0, 0));
// 		setLayout(null);

// 		exitButton.setBounds(1245, 0, 30, 30);
// 		exitButton.setBorderPainted(false);
// 		exitButton.setContentAreaFilled(false);
// 		exitButton.setFocusPainted(false);
// 		exitButton.addMouseListener(new MouseAdapter() {
// 			@Override
// 			public void mouseEntered(MouseEvent e) {
// 				exitButton.setIcon(exitButtonEnteredImage);
// 				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
// 				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
// 				buttonEnteredMusic.start();
// 			}
// 			@Override
// 			public void mouseExited(MouseEvent e) {
// 				exitButton.setIcon(exitButtonBasicImage);
// 				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
// 			}
// 			@Override
// 			public void mousePressed(MouseEvent e) {
// 				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
// 				buttonEnteredMusic.start();
// 				try {
// 					Thread.sleep(1000);
// 				} catch (InterruptedException ex) {
// 					ex.printStackTrace();
// 				}
// 				System.exit(0);
// 			}
// 		});
// 		add(exitButton);
		
// 		startButton.setBounds(40, 200, 400, 100);
// 		startButton.setBorderPainted(false);
// 		startButton.setContentAreaFilled(false);
// 		startButton.setFocusPainted(false);
// 		startButton.addMouseListener(new MouseAdapter() {
// 			@Override
// 			public void mouseEntered(MouseEvent e) {
// 				startButton.setIcon(startButtonEnteredImage);
// 				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
// 				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
// 				buttonEnteredMusic.start();
// 			}
// 			@Override
// 			public void mouseExited(MouseEvent e) {
// 				startButton.setIcon(startButtonBasicImage);
// 				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
// 			}
// 			@Override
// 			public void mousePressed(MouseEvent e) {
// 				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
// 				buttonEnteredMusic.start();
// 				startButton.setVisible(false);
// 				quitButton.setVisible(false);
// 				background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg"))
// 						.getImage();
// 			}
// 		});
// 		add(startButton);
		
// 		quitButton.setBounds(40, 330, 400, 100);
// 		quitButton.setBorderPainted(false);
// 		quitButton.setContentAreaFilled(false);
// 		quitButton.setFocusPainted(false);
// 		quitButton.addMouseListener(new MouseAdapter() {
// 			@Override
// 			public void mouseEntered(MouseEvent e) {
// 				quitButton.setIcon(quitButtonEnteredImage);
// 				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
// 				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
// 				buttonEnteredMusic.start();
// 			}
// 			@Override
// 			public void mouseExited(MouseEvent e) {
// 				quitButton.setIcon(quitButtonBasicImage);
// 				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
// 			}
// 			@Override
// 			public void mousePressed(MouseEvent e) {
// 				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
// 				buttonEnteredMusic.start();
// 				try {
// 					Thread.sleep(1000);
// 				} catch (InterruptedException ex) {
// 					ex.printStackTrace();
// 				}
// 				System.exit(0);
// 			}
// 		});
// 		add(quitButton);
		
		
// 		menuBar.setBounds(0, 0, 1280, 30);
// 		menuBar.addMouseListener(new MouseAdapter() {
// 			@Override
// 			public void mousePressed(MouseEvent e) {
// 				mouseX = e.getX();
// 				mouseY = e.getY();
// 			}
// 		});
// 		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
// 			@Override
// 			public void mouseDragged(MouseEvent e) {
// 				int x = e.getXOnScreen();
// 				int y = e.getYOnScreen();
// 				setLocation(x - mouseX, y - mouseY);
// 			}
// 		});
// 		add(menuBar);

// 		Music introMusic = new Music("introMusic.mp3", true);
// 		introMusic.start();
// 	}

// 	public void paint(Graphics g) {
// 		screenImage = createImage(dynamic_beat_5.Main.SCREENT_WIDTH, dynamic_beat_5.Main.SCREENT_HEIGHT);
// 		screenGraphic = screenImage.getGraphics();
// 		screenDraw(screenGraphic);
// 		g.drawImage(screenImage, 0, 0, null);
// 	}

// 	public void screenDraw(Graphics g) {
// 		g.drawImage(background, 0, 0, null);
// 		paintComponents(g);
// 		this.repaint();
// 	}

// }



// 버전2 = 코드 가독성 및 중복 제거본  
public class DynamicBeat extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;

    private final ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));  
    private final ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
    private final ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
    private final ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
    private final ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png")); 
    private final ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
    // 메인화면 버튼
	private final ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png")); 
	private final ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png"));
	private final ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/rightButtonEntered.png"));
	private final ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png"));
    // 메인화면 화면
    private Image titleImage = new ImageIcon(Main.class.getResource("../images/Mighty Love Title Image.png")).getImage();
    private Image selectedImage = new ImageIcon(Main.class.getResource("../images/Mighty Love Start Image.png")).getImage();

    // 인트로
    private Image background = new ImageIcon(Main.class.getResource("../images/introBackgroundTitle.jpg")).getImage();
    private final JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

    private final JButton exitButton = new JButton(exitButtonBasicImage);
    private final JButton startButton = new JButton(startButtonBasicImage);
    private final JButton quitButton = new JButton(quitButtonBasicImage);
    private final JButton leftButton = new JButton(leftButtonEnteredImage);
    private final JButton rightButton = new JButton(rightButtonBasicImage);
    
    private int mouseX, mouseY;

    // 시작버튼 시 메인화면 활성화
    private boolean isMainScreen = false;

    public DynamicBeat() {
        initUI();
        addButtons();
        addMenuBar();
        playIntroMusic();
    }

    private void initUI() {
        setUndecorated(true);
        setTitle("Dynamic Beat");
        setSize(dynamic_beat_5.Main.SCREENT_WIDTH, dynamic_beat_5.Main.SCREENT_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(new Color(0, 0, 0, 0));
        setLayout(null);
    }

    private void addButtons() {
        setupButton(exitButton, true, 1245, 0, 30, 30, exitButtonBasicImage, exitButtonEnteredImage, () -> System.exit(0));
        setupButton(startButton, true, 40, 200, 400, 100, startButtonBasicImage, startButtonEnteredImage, () -> {
            startButton.setVisible(false);
            quitButton.setVisible(false);
            background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();

            // 메인화면 설정
            isMainScreen =true;
            // 메인화면 버튼
            setupButton(leftButton, true, 140, 310, 60, 60, leftButtonBasicImage, leftButtonEnteredImage,  ()-> {} );
            setupButton(rightButton, true, 1080, 310, 60, 60, rightButtonBasicImage, rightButtonEnteredImage, ()-> {});
        });
        setupButton(quitButton, true, 40, 330, 400, 100, quitButtonBasicImage, quitButtonEnteredImage, () -> System.exit(0));
        

        

    }

    private void setupButton(JButton button, boolean visible, int x, int y, int width, int height, ImageIcon basicImage, ImageIcon enteredImage, Runnable action) {
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setVisible(visible);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setIcon(enteredImage);
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
                playSound("buttonEnteredMusic.mp3");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setIcon(basicImage);
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                playSound("buttonPressedMusic.mp3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                action.run();
            }
        });
        add(button);
    }

    private void addMenuBar() {
        menuBar.setBounds(0, 0, 1280, 30);
        menuBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
        menuBar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });
        add(menuBar);
    }

    private void playIntroMusic() {
        Music introMusic = new Music("introMusic.mp3", true);
        introMusic.start();
    }

    private void playSound(String fileName) {
        Music sound = new Music(fileName, false);
        sound.start();
    }

    @Override
    public void paint(Graphics g) {
        screenImage = createImage(dynamic_beat_5.Main.SCREENT_WIDTH, dynamic_beat_5.Main.SCREENT_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    private void screenDraw(Graphics g) {
        g.drawImage(background, 0, 0, null);

		if(isMainScreen)
		{
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 340, 70, null);
		}

        paintComponents(g);
        this.repaint();
    }

}