import javax.swing.*;
import java.awt.*;

public class Potato extends  Object{
    public Potato(int x , int y , ID id){

        super(x, y, id);
        Velx = 0;
    }
    public void tick(){
        x += Velx;
        y += Vely;
    }
    public void render(Graphics g){
        ImageIcon pot = new ImageIcon("potato_mine.gif");
        g.drawImage(pot.getImage(), x, y, null);

    }
}
