import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

/////////////////////////// our main class , main method, and main class
public class First extends Canvas implements Runnable {
    private Thread thread;
    private boolean run = false;
    public Handler handler;
    static int Clomun[] = {80, 190, 300, 414, 528};
    static Menuf mf = new Menuf();
    static Lostf l = new Lostf();
    static int rand_int;
    int ZombieW=0;
    public static Vector<Object> Zombiess = new Vector<>();
    boolean checkkk=true;
    boolean wincheck=false;
    WInform w = new WInform();
    public First() {

        new Window(1300, 700, "Plants VS Zombies", this);
        handler = new Handler();
        this.addMouseListener(new MouseListener(handler));

        Random random = new Random();

        Timer timer2 = new Timer();
        Timer timer1 = new Timer();

        TimerTask task = new TimerTask() {


            @Override
            public void run() {
                if (Settingf.ZombieCount > 0) {
                    System.out.println("zombie left : " + Settingf.ZombieCount);
                    rand_int = random.nextInt(4);
                    if (Settingf.ZombieCount % 3 == 0) {
                        ZombieS zombie = new ZombieS(1200, Clomun[rand_int], ID.Zombie);
                        handler.addObject(zombie); //Zombies appear appears
                        Zombiess.add(zombie);
                        Settingf.ZombieCount--;

                    } else {
                        Zombie zombie = new Zombie(1200, Clomun[rand_int], ID.Zombie);
                        handler.addObject(zombie); //Zombies appear appears
                        Zombiess.add(zombie);
                        Settingf.ZombieCount--;

                    }


                }

            }
        };

        TimerTask task1 = new TimerTask()
        {
            @Override
            public void run() {
                try {
                    for (Object zombie : Zombiess) {
                        for (Object object : handler.objects) {
                            if (object instanceof pea) {

                                if (object.y == zombie.y)
                                {
                                    if (object.x - zombie.x >= 10)
                                    {
                                        if (zombie instanceof Zombie) {
                                            Zombie zm = (Zombie) zombie;
                                            handler.removeObject(object);
                                            if (zm.hit(20)) {
                                                handler.removeObject(zombie);
                                                Zombiess.remove(zombie); // this
                                            }
                                        }

                                        if (zombie instanceof ZombieS)
                                        {

                                            ZombieS zm = (ZombieS) zombie;
                                            handler.removeObject(object);
                                            ZombieW++;
                                            if (zm.hit(20))
                                            {
                                                handler.removeObject(zombie);
                                                Zombiess.remove(zombie); // this
                                            }
                                        }
                                        break;
                                    }
                                }
                            }

                        }

                        for (int i = 0; i < MouseListener.plants.size(); i++) {
                            if (zombie.y - MouseListener.plants.get(i).y == 0) {
                                if (zombie.x - MouseListener.plants.get(i).x <= 50) {

                                    zombie.Velx = 0;
                                    // boolean SunfDeleted=false;
                                    if (MouseListener.Sunfmade == true) {
                                        int finalI = i;
                                        TimerTask task3 = new TimerTask() {
                                            @Override
                                            public void run() {
                                                if (MouseListener.plants.size() - 1 >= finalI) {
                                                    handler.removeObject(MouseListener.plants.get(finalI));
                                                    MouseListener.plants.remove(finalI);
                                                    zombie.Velx = -0.000000005d;
                                                    this.cancel();
                                                }
                                            }
                                        };
                                        timer1.scheduleAtFixedRate(task3, 3000, 3000);
                                    } else if (MouseListener.Potatomade == true) {
                                        int finalI = i;

                                        handler.removeObject(MouseListener.plants.get(finalI));
                                        MouseListener.plants.remove(finalI);
                                        handler.removeObject(zombie);
                                        Zombiess.remove(zombie);
                                       // zombie.Velx = -0.000000005d;


                                    } else if (MouseListener.Peashmade == true) {
                                        int finalI = i;

                                        TimerTask task3 = new TimerTask() {
                                            @Override
                                            public void run() {
                                                if (MouseListener.plants.size() - 1 >= finalI)
                                                {
                                                    handler.removeObject(MouseListener.plants.get(finalI));
                                                    if(MouseListener.PeaShooters.get(MouseListener.plants.get(finalI)) != null)
                                                    {
                                                        MouseListener.PeaShooters.get(MouseListener.plants.get(finalI)).cancel();
                                                        MouseListener.PeaShooters.remove(MouseListener.plants.get(finalI));
                                                    }
                                                    MouseListener.plants.remove(finalI);


                                                    // System.out.println(MouseListener.objects.get(MouseListener.plants.get(finalI)));
                                                    zombie.Velx = -0.000000005d;
                                                    this.cancel();
                                                }
                                            }
                                        };
                                        timer1.scheduleAtFixedRate(task3, 3000, 3000);
                                    } else if (MouseListener.Repeatermade == true) {
                                        int finalI = i;

                                        TimerTask task3 = new TimerTask() {
                                            @Override
                                            public void run() {
                                                if (MouseListener.plants.size() - 1 >= finalI) {
                                                    handler.removeObject(MouseListener.plants.get(finalI));
                                                    handler.removeObject(MouseListener.plants.get(finalI));
                                                    if(MouseListener.PeaShooters.get(MouseListener.plants.get(finalI)) != null)
                                                    {
                                                        MouseListener.PeaShooters.get(MouseListener.plants.get(finalI)).cancel();
                                                        MouseListener.PeaShooters.remove(MouseListener.plants.get(finalI));
                                                    }
                                                    MouseListener.plants.remove(finalI);
                                                    zombie.Velx = -0.000000005d;
                                                    this.cancel();
                                                }
                                            }
                                        };
                                        timer1.scheduleAtFixedRate(task3, 3000, 3000);


                                    }

                                }
                            }
                        }


                        if (zombie.x < 322) {
                            Zombiess.remove(zombie);
                            handler.removeObject(zombie);
                            Window.frame.setVisible(false);
                            l.setSize(700, 700);
                            l.setVisible(true);
                            l.setLocationRelativeTo(null);
                            l.setContentPane(l.panel1);
                        }

                    }
                    System.out.println(Settingf.ZombieCount);
                    if((Zombiess.isEmpty())&&(Settingf.ZombieCount==0)){
                        w.setSize(700, 700);
                        w.setVisible(true);
                        w.setLocationRelativeTo(null);
                        w.setContentPane(w.panel4);
                    }

                }
                catch(Exception ex)
                {

                }
            }


        };






        timer1.scheduleAtFixedRate(task, 8000, 8000);
        timer1.scheduleAtFixedRate(task1, 0, 10);
    }

    public synchronized void strat() { // starting the thread
        thread = new Thread(this);
        thread.start();
        run = true;


    }


    public synchronized void stop() { //stoping it
        try {
            thread.join();
            run = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void run() { //game loop
        System.out.println(Settingf.SunCount); //ezafe shodan khorshid ha har5 sanie
       /*  Timer t = new Timer();

       TimerTask task = new TimerTask() {


            @Override
            public void run() {

                Settingf.SunCount = Settingf.SunCount + 25;

            }
        };


        t.scheduleAtFixedRate(task, 0, 5000);
*/

        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while (run) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }

            if (run)
                render();

            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                // System.out.println("FPS:" + frames);
                frames = 0;
            }
        }

        stop();


    }





    public void render() { //SHowing background and front yard picture
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        ImageIcon back = new ImageIcon("background.jpg");

        g.drawImage(back.getImage(), 0, 0, 1300, 700, null);
        handler.render(g);

        g.setColor(Color.BLACK);
        g.setFont(new Font("kranky", Font.BOLD, 20));
        g.drawString(String.valueOf(Settingf.SunCount), 50,125);
        g.dispose();
        bs.show();
    }

    public void tick() {
        handler.tick();
        if(checkkk==true){
            Timer t = new Timer();

            TimerTask task = new TimerTask() {


                @Override
                public void run() {

                    Settingf.SunCount = Settingf.SunCount + 25;

                }
            };


            t.scheduleAtFixedRate(task, 5000, 5000);
            checkkk=false;
        }


    }


    public static void main(String[] args) {



        mf.setSize(700, 700);
        mf.setVisible(true);
        mf.setLocationRelativeTo(null);
        mf.setContentPane(mf.panel1);

    }
}










