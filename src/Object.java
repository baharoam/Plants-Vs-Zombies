import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public abstract class Object extends JFrame { //objects in game are going to be inheritating from this

    protected int x, y;


    protected ID id;
    protected double Velx;
    protected int Vely; //speed in each direction

    public Object(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;

    }

    public abstract void tick();

    public abstract void render(Graphics g);

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public double getVelx() {
        return Velx;
    }

    public void setVelx(int velx) {
        Velx = velx;
    }

    public int getVely() {
        return Vely;
    }

    public void setVely(int vely) {
        Vely = vely;
    }

}


/*

static double middleX = 0.0, middleY = 0.0;

    //protected int VelZ;



public Object(int x , int y ,ID id){
        middleX = x;
        middleY = y;
        this.id = id;

  public static void mouseclick() {
            double mouseX = 1.0;
            double mouseY = 1.0;

            while ((mouseX != 0 || mouseY != 0)) {

                mouseX = MouseInfo.getPointerInfo().getLocation().getX();
                mouseY = MouseInfo.getPointerInfo().getLocation().getY();


                if ((674 <= mouseX) && (mouseX < 755) && (mouseY >= 112) && (mouseY < 204)) {
                    System.out.println("firts");
                    middleX = 714;
                    middleY = 153;

                }

                if ((674.00 <= mouseX) && (mouseX < 755) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 714;
                    middleY = 253;
                }


                if ((674.00 <= mouseX) && (mouseX < 755) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 714;
                    middleY = 353;
                }


                if ((674.00 <= mouseX) && (mouseX < 755) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 714;
                    middleY = 452;
                }


                if ((674.00 <= mouseX) && (mouseX < 755) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 714;
                    middleY = 551;

                }


                if ((755 <= mouseX) && (mouseX < 830) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX =
                            middleY = 153;
                }

                if ((755 <= mouseX) && (mouseX < 830) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 792;
                    middleY = 253;
                }


                if ((755 <= mouseX) && (mouseX < 830) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 792;
                    middleY = 353;
                }


                if ((755 <= mouseX) && (mouseX < 830) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 792;
                    middleY = 452;
                }


                if ((755 <= mouseX) && (mouseX < 830) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 792;
                    middleY = 551;

                }


                if ((830 <= mouseX) && (mouseX < 919) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 874;
                    middleY = 153;
                }

                if ((830 <= mouseX) && (mouseX < 919) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 874;
                    middleY = 253;
                }


                if ((830 <= mouseX) && (mouseX < 919) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 874;
                    middleY = 353;
                }


                if ((830 <= mouseX) && (mouseX < 919) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 874;
                    middleY = 452;
                }


                if ((830 <= mouseX) && (mouseX < 919) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 874;
                    middleY = 551;

                }


                if ((919 <= mouseX) && (mouseX < 994) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 956;
                    middleY = 153;
                }

                if ((919 <= mouseX) && (mouseX < 994) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX =
                            middleY = 253;
                }


                if ((919 <= mouseX) && (mouseX < 994) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 956;
                    middleY = 353;
                }


                if ((919 <= mouseX) && (mouseX < 994) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 956;
                    middleY = 452;
                }


                if ((919 <= mouseX) && (mouseX < 994) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 956;
                    middleY = 551;

                }


                if ((994 <= mouseX) && (mouseX < 1077) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 956;
                    middleY = 153;
                }

                if ((994 <= mouseX) && (mouseX < 1077) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 956;
                    middleY = 253;
                }


                if ((994 <= mouseX) && (mouseX < 1077) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 956;
                    middleY = 353;
                }


                if ((994 <= mouseX) && (mouseX < 1077) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 956;
                    middleY = 452;
                }


                if ((994 <= mouseX) && (mouseX < 1077) && (mouseY >= 500) && (mouseY < 603)) {

                    middleX = 956;
                    middleY = 551;
                }


                if ((1077 <= mouseX) && (mouseX < 1156) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 1117;
                    middleY = 153;
                }

                if ((1077 <= mouseX) && (mouseX < 1156) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 1117;
                    middleY = 253;
                }


                if ((1077 <= mouseX) && (mouseX < 1156) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 1117;
                    middleY = 353;
                }


                if ((1077 <= mouseX) && (mouseX < 1156) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 1117;
                    middleY = 452;
                }


                if ((1077 <= mouseX) && (mouseX < 1156) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 1117;
                    middleY = 551;

                }


                if ((1156 <= mouseX) && (mouseX < 1234) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 1195;
                    middleY = 153;
                }

                if ((1156 <= mouseX) && (mouseX < 1234) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 1195;
                    middleY = 253;
                }


                if ((1156 <= mouseX) && (mouseX < 1234) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 1195;
                    middleY = 353;
                }


                if ((1156 <= mouseX) && (mouseX < 1234) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 1195;
                    middleY = 452;
                }


                if ((1156 <= mouseX) && (mouseX < 1234) && (mouseY >= 500) && (mouseY < 603)) {

                    middleX = 1195;
                    middleY = 551;
                }


                if ((1234 <= mouseX) && (mouseX < 1313) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 1273;
                    middleY = 153;
                }

                if ((1234 <= mouseX) && (mouseX < 1313) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 1273;
                    middleY = 253;
                }


                if ((1234 <= mouseX) && (mouseX < 1313) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 1273;
                    middleY = 353;
                }


                if ((1234 <= mouseX) && (mouseX < 1313) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 1273;
                    middleY = 452;
                }


                if ((1234 <= mouseX) && (mouseX < 1313) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 1273;
                    middleY = 551;

                }


                if ((1313 <= mouseX) && (mouseX < 1402) && (mouseY >= 112) && (mouseY < 204)) {
                    middleX = 1357;
                    middleY = 153;
                }

                if ((1313 <= mouseX) && (mouseX < 1402) && (mouseY >= 204) && (mouseY < 302)) {
                    middleX = 1357;
                    middleY = 253;
                }


                if ((1313 <= mouseX) && (mouseX < 1402) && (mouseY >= 302) && (mouseY < 405)) {
                    middleX = 1357;
                    middleY = 353;
                }


                if ((1313 <= mouseX) && (mouseX < 1402) && (mouseY >= 405) && (mouseY < 500)) {
                    middleX = 1357;
                    middleY = 452;
                }


                if ((1313 <= mouseX) && (mouseX < 1402) && (mouseY >= 500) && (mouseY < 603)) {
                    middleX = 1357;
                    middleY = 551;
                    System.out.println("middle " + middleX + middleY);
                }


            }


        }

 */