package dynamic_beat_15;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

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
    // 인트로 버튼 이미지
    private final ImageIcon exitButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/exitButtonBasic.png"));
    private final ImageIcon exitButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/exitButtonEntered.png"));
    private final ImageIcon startButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/startButtonEntered.png"));
    private final ImageIcon startButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/startButtonBasic.png"));
    private final ImageIcon quitButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/quitButtonEntered.png"));
    private final ImageIcon quitButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/quitButtonBasic.png"));
    // 인트로 버튼 및 배경
    private Image background = new ImageIcon(Main.class.getResource("../images/introBackgroundTitle.jpg")).getImage();
    private final JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
    private final JButton exitButton = new JButton(exitButtonBasicImage);
    private final JButton startButton = new JButton(startButtonBasicImage);
    private final JButton quitButton = new JButton(quitButtonBasicImage);

    // 메인화면 버튼 이미지
    private final ImageIcon leftButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/leftButtonEntered.png"));
    private final ImageIcon leftButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/leftButtonBasic.png"));
    private final ImageIcon rightButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/rightButtonEntered.png"));
    private final ImageIcon rightButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/rightButtonBasic.png"));
    private final ImageIcon easyButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/easyButtonEntered.png"));
    private final ImageIcon easyButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/easyButtonBasic.png"));
    private final ImageIcon hardButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/hardButtonEntered.png"));
    private final ImageIcon hardButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/hardButtonBasic.png"));
    // 메인화면 버튼
    private final JButton leftButton = new JButton(leftButtonEnteredImage);
    private final JButton rightButton = new JButton(rightButtonBasicImage);
    private final JButton easyButton = new JButton(easyButtonBasicImage);
    private final JButton hardButton = new JButton(hardButtonBasicImage);

    // 게임 화면 이미지
    private final ImageIcon backButtonBasicImage = new ImageIcon(
            Main.class.getResource("../images/backButtonBasic.png"));
    private final ImageIcon backButtonEnteredImage = new ImageIcon(
            Main.class.getResource("../images/backButtonEntered.png"));

    // 게임 클래스 인스턴스 생성
    public static Game game; // 해당 프로젝트 내에서 인스턴스 생성 없이 다 사용가능하게 위해
    // 게임 화면 버튼
    private final JButton backButton = new JButton(backButtonBasicImage);
    // 게임 화면 활성화
    private boolean isGameScreen = false;

    // 인트로 음악
    private final Music introMusic = new Music("introMusic.mp3", true);
    // 마우스 좌표
    private int mouseX, mouseY;

    ArrayList<Track> trackList = new ArrayList<Track>();

    // 메인화면 화면
    private Image titleImage;
    private Image selectedImage;
    private Music selectedMusic;
    private int nowSelected = 0;

    // 메인화면 활성화
    private boolean isMainScreen = false;

    // 생성자 함수
    public DynamicBeat() {
        initUI();
        addButtons();
        addMenuBar();

        addKeyListener(new KeyListner());
    }

    // 노래 데이터 가변적으로 삽입
    String[][] trackData = {
            { "Mighty Love Title Image.png", "Mighty Love Start Image.png", "Mighty Love Game Image.jpg",
                    "Mighty Love Selected.mp3", "Mighty Love GameStart.mp3", "Joakim Karud - Mighty Love" },
            { "Wild Flower Title Image.png", "Wild Flower Start Image.png", "Wild Flower Game Image.jpg",
                    "Wild Flower Selected.mp3", "Wild Flower Selected.mp3", "Joakim Karud - Wild Flower" },
            { "Energy Title Image.png", "Energy Start Image.png", "Energy Game Image.png", "Energy Selected.mp3",
                    "Energy Selected.mp3", "Bensound" }
    };

    private void initUI() {
        for (String[] track : trackData) {
            trackList.add(new Track(track[0], track[1], track[2], track[3], track[4], track[5]));
        }

        setUndecorated(true);
        setTitle("Dynamic Beat");
        setSize(dynamic_beat_10.Main.SCREENT_WIDTH, dynamic_beat_10.Main.SCREENT_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(new Color(0, 0, 0, 0));
        setLayout(null);
        introMusic.start();
    }

    private void addButtons() {
        setupButton(exitButton, true, 1245, 0, 30, 30, exitButtonBasicImage, exitButtonEnteredImage,
                () -> System.exit(0));
        setupButton(startButton, true, 40, 200, 400, 100, startButtonBasicImage, startButtonEnteredImage, () -> {
            startButton.setVisible(false);
            quitButton.setVisible(false);
            background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();

            // 메인화면 설정
            isMainScreen = true;
            // 메인화면 버튼
            setupButton(leftButton, true, 140, 310, 60, 60, leftButtonBasicImage, leftButtonEnteredImage, () -> {
                SelectDirection("Left");
            });
            setupButton(rightButton, true, 1080, 310, 60, 60, rightButtonBasicImage, rightButtonEnteredImage, () -> {
                SelectDirection("Right");
            });
            setupButton(easyButton, true, 375, 580, 250, 67, easyButtonBasicImage, easyButtonEnteredImage, () -> {
                gameStart(nowSelected, "easy");
            });
            setupButton(hardButton, true, 655, 580, 250, 67, hardButtonBasicImage, hardButtonEnteredImage, () -> {
                gameStart(nowSelected, "hard");
            });

            // 게임화면 뒤로 가기 버튼
            setupButton(backButton, false, 20, 50, 60, 60, backButtonBasicImage, backButtonEnteredImage, () -> {
                backMain(nowSelected);
            });

            // 메인화면 노래
            introMusic.close();
            System.out.println("인트로 노래중지");
            selectTrack(nowSelected);

        });
        setupButton(quitButton, true, 40, 330, 400, 100, quitButtonBasicImage, quitButtonEnteredImage,
                () -> System.exit(0));

    }

    private void setupButton(JButton button, boolean visible, int x, int y, int width, int height, ImageIcon basicImage,
            ImageIcon enteredImage, Runnable action) {
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

    private void playSound(String fileName) {
        Music sound = new Music(fileName, false);
        sound.start();
    }

    @Override
    public void paint(Graphics g) {
        screenImage = createImage(dynamic_beat_10.Main.SCREENT_WIDTH, dynamic_beat_10.Main.SCREENT_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw((Graphics2D) screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
        // System.out.println("DynamicBeat 클래스 내 paint 함수");
    }

    private void screenDraw(Graphics2D g) {
        g.drawImage(background, 0, 0, null);

        if (isMainScreen) {
            g.drawImage(selectedImage, 340, 100, null);
            g.drawImage(titleImage, 340, 70, null);
        }
        if (isGameScreen) {
            game.screenDraw(g);
        }

        paintComponents(g);
        try {
            Thread.sleep(5); //0.005초 대기
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.repaint();
    }

    // 선택 음악
    public void selectTrack(int nowSelected) {
        if (selectedMusic != null)
            selectedMusic.close();
        titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage()))
                .getImage();
        selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage()))
                .getImage();
        selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(), true);
        System.out.println("selectedMusic:" + selectedMusic);
        System.out.println("introMusic:" + introMusic);

        selectedMusic.start();
    }

    // 메인화면 화살표
    public void SelectDirection(String Direction) {
        if (Direction.equals("Left")) {
            if (nowSelected == 0) {
                nowSelected = trackList.size() - 1;
            } else {
                nowSelected--;
            }
        } else {
            if (nowSelected == trackList.size() - 1) {
                nowSelected = 0;
            } else {
                nowSelected++;
            }
        }
        selectTrack(nowSelected);
    }

    // 게임화면 시작 시
    public void gameStart(int nowSelected, String difficulty) {
        if (selectedMusic != null)
            selectedMusic.close();
        isMainScreen = false;
        leftButton.setVisible(false);
        rightButton.setVisible(false);
        easyButton.setVisible(false);
        hardButton.setVisible(false);
        background = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getGameImage()))
                .getImage();
        backButton.setVisible(true);
        isGameScreen = true;
        game = new Game(trackList.get(nowSelected).getTitleName(), difficulty,
                trackList.get(nowSelected).getGameMusic());
        game.start();
        setFocusable(true);
    }

    // 게임화면에서 뒤로가기
    public void backMain(int nowSelected) {
        isMainScreen = true;
        leftButton.setVisible(true);
        rightButton.setVisible(true);
        easyButton.setVisible(true);
        hardButton.setVisible(true);
        background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
        selectTrack(nowSelected);
        backButton.setVisible(false);
        isGameScreen = false;
        game.close();
    }

}