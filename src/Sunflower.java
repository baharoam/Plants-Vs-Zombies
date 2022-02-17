import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Sunflower extends Object {

    public Sunflower(int x, int y, ID id) {

        super(x, y, id);
        Velx=0;
    }

    public void tick() { // move dadane
        x += Velx;
        y += Vely;
    }

    public void render(Graphics g) {
        ImageIcon Sunfl = new ImageIcon("sunflower.gif");
        g.drawImage(Sunfl.getImage(), x, y, null);

    }
}
/*

 private JLabel label;
    Handler handler;
    public Sunflower(int x, int y, ID id) {
        super(x, y, id);


    }

    public void render(Graphics g) {

        ImageIcon sf = new ImageIcon("sunflower.gif");

        g.drawImage(sf.getImage() , 700,800,null);
    }

}



 */