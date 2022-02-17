import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class PeaShooter extends Object{
    Handler handler;
    public PeaShooter(int x , int y , ID id){

        super(x, y, id);
        Velx=0;
    }
    public void tick(){
        x += Velx;
        y += Vely;
    }
    public void render(Graphics g){
        ImageIcon Sunfl = new ImageIcon("pea_shooter.gif");
        g.drawImage(Sunfl.getImage(), x, y, null);


    }
}
