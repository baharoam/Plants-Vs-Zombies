import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Zombie extends Object{
    Handler handler;
    int health = 100;
    public Zombie(int x , int y , ID id){

        super(x, y, id);
        Velx = -0.000000005d;
        Vely=0;


    }
    @Override
    public void tick(){
        x += Velx;
        y += Vely;

    }


    public boolean hit(int power)
    {
        health -= power;

        if(health <= 0)
            return true;

        return false;
    }

    public void render(Graphics g){

        ImageIcon pot = new ImageIcon("NormalZombie.gif");
        g.drawImage(pot.getImage(), x, y, null);


    }

}
