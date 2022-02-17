import javax.swing.*;
import java.awt.*;

public class Repeater extends Object {
    public Repeater(int x , int y , ID id){

        super(x, y, id);
        Velx=0;
    }
    public void tick(){
        x += Velx;
        y += Vely;
    }
    public void render(Graphics g){
        ImageIcon rp = new ImageIcon("repeater.gif");
        g.drawImage(rp.getImage(), x, y, null);

    }
}
