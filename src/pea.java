import javax.swing.*;
import java.awt.*;

public class pea extends Object{
    public pea(int x, int y, ID id) {

        super(x, y, id);
        Velx=1;
    }

    public void tick() { // move dadane
        x += Velx;
        y += Vely;

    }

    public void render(Graphics g)
    {
        ImageIcon peaa = new ImageIcon("Pea.png");
        g.drawImage(peaa.getImage(), x, y, null);

    }
}
