package dynamic_beat_15;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListner extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e){
        if(DynamicBeat.game==null) return;
        DynamicBeat.game.Press(e);

    }
    @Override
    public void keyReleased(KeyEvent e){
        if(DynamicBeat.game==null) return;
        DynamicBeat.game.Release(e);


    }
    
}
