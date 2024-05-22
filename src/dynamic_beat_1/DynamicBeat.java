package dynamic_beat_1;
import javax.swing.JFrame;


public class DynamicBeat extends JFrame {
    
    public DynamicBeat(){
        setTitle("Dynamic Beat");
        setSize(Main.SCREENT_WIDTH,Main.SCREENT_HEIGHT);
        setResizable(false); // 인위적으로 줄이기 X
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
}