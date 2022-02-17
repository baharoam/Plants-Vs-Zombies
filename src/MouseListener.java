import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public class MouseListener extends MouseAdapter {
    private Handler handler;
    private boolean SunfCheck, PotatoCheck, PeashooterCheck, RepeaterCheck = false;
    private int MiddleX, MiddleY = 0;
    static Timer timer = new Timer();
    public static ArrayList<Object> plants = new ArrayList<Object>();
    Hashtable<Object, TimerTask> objects = new Hashtable<Object, TimerTask>();
    static boolean Sunfmade, Potatomade, Peashmade, Repeatermade = false;
    static long sun = 0;
    public static Hashtable<Object, TimerTask> PeaShooters = new Hashtable<>();

    public MouseListener(Handler handler) {

        this.handler = handler;

    }


    public void mouseClicked(MouseEvent e) {
        long suncooldown = System.currentTimeMillis() - sun;
        if (SunfCheck == true) {

            System.out.println("sunfllll " + e.getX() + " " + e.getY());
            SunfCheck = false;

            if ((Settingf.SunCount >= 50) && (suncooldown > 3000)) {

                if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 55 && e.getY() < 186)) {
                    System.out.println("khune 1");
                    SunfCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 2");
                    SunfCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 3");
                    SunfCheck = false;
                    MiddleX = 535;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 4");
                    SunfCheck = false;
                    MiddleX = 637;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 5");
                    SunfCheck = false;
                    MiddleX = 740;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 835 && e.getX() < 930) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 6");
                    SunfCheck = false;
                    MiddleX = 842;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 7");
                    SunfCheck = false;
                    MiddleX = 941;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 8");
                    SunfCheck = false;
                    MiddleX = 1044;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 9");
                    SunfCheck = false;
                    MiddleX = 1159;
                    MiddleY = 80;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 186 && e.getY() < 288)) {
                    System.out.println("khune 10");
                    SunfCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 11");
                    SunfCheck = false;
                    MiddleX = 430;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 12");
                    SunfCheck = false;
                    MiddleX = 535;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 13");
                    SunfCheck = false;
                    MiddleX = 637;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 14");
                    SunfCheck = false;
                    MiddleX = 740;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 186 && e.getY() < 288)) {
                    System.out.println("khune 15");
                    SunfCheck = false;
                    MiddleX = 842;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 16");
                    SunfCheck = false;
                    MiddleX = 941;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 17");
                    SunfCheck = false;
                    MiddleX = 1044;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 18");
                    SunfCheck = false;
                    MiddleX = 1159;
                    MiddleY = 190;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 10");
                    SunfCheck = false;
                    MiddleX = 332;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 11");
                    SunfCheck = false;
                    MiddleX = 430;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 12");
                    SunfCheck = false;
                    MiddleX = 535;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 13");
                    SunfCheck = false;
                    MiddleX = 637;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 14");
                    SunfCheck = false;
                    MiddleX = 740;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 15");
                    SunfCheck = false;
                    MiddleX = 842;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 16");
                    SunfCheck = false;
                    MiddleX = 941;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 17");
                    SunfCheck = false;
                    MiddleX = 1044;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 18");
                    SunfCheck = false;
                    MiddleX = 1159;
                    MiddleY = 300;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 414 && e.getY() < 514)) {
                    System.out.println("khune 10");
                    SunfCheck = false;
                    MiddleX = 332;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 11");
                    SunfCheck = false;
                    MiddleX = 430;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 12");
                    SunfCheck = false;
                    MiddleX = 535;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 13");
                    SunfCheck = false;
                    MiddleX = 637;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 14");
                    SunfCheck = false;
                    MiddleX = 740;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 414 && e.getY() < 514)) {
                    System.out.println("khune 15");
                    SunfCheck = false;
                    MiddleX = 842;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 16");
                    SunfCheck = false;
                    MiddleX = 941;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 17");
                    SunfCheck = false;
                    MiddleX = 1044;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 18");
                    SunfCheck = false;
                    MiddleX = 1159;
                    MiddleY = 414;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 514 && e.getY() < 623)) {
                    System.out.println("khune 10");
                    SunfCheck = false;
                    MiddleX = 332;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 11");
                    SunfCheck = false;
                    MiddleX = 430;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 12");
                    SunfCheck = false;
                    MiddleX = 535;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 13");
                    SunfCheck = false;
                    MiddleX = 637;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 14");
                    SunfCheck = false;
                    MiddleX = 740;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 514 && e.getY() < 623)) {
                    System.out.println("khune 15");
                    SunfCheck = false;
                    MiddleX = 842;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 514 && e.getY() < 623))) {

                    SunfCheck = false;
                    MiddleX = 941;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 514 && e.getY() < 623))) {
                    SunfCheck = false;
                    MiddleX = 1044;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 514 && e.getY() < 623))) {

                    SunfCheck = false;
                    MiddleX = 1159;
                    MiddleY = 528;
                    Sunflower sf = new Sunflower(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(sf);
                    plants.add(sf);
                    Sunfmade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            Settingf.SunCount=Settingf.SunCount+50;

                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 5000);
                    sun = System.currentTimeMillis();
                }
                SunfCheck = false;
            }
        }


        if (PotatoCheck == true) {

            PotatoCheck = false;

            if ((Settingf.SunCount >= 50) && (suncooldown > 3000)) {


                if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 55 && e.getY() < 186)) {
                    PotatoCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 55 && e.getY() < 186))) {

                    PotatoCheck = false;
                    MiddleX = 430;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 55 && e.getY() < 186))) {
                    PotatoCheck = false;
                    MiddleX = 535;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 55 && e.getY() < 186))) {
                    PotatoCheck = false;
                    MiddleX = 637;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 55 && e.getY() < 186))) {
                    PotatoCheck = false;
                    MiddleX = 740;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 835 && e.getX() < 930) && (e.getY() > 55 && e.getY() < 186))) {
                    PotatoCheck = false;
                    MiddleX = 842;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 55 && e.getY() < 186))) {
                    PotatoCheck = false;
                    MiddleX = 941;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 55 && e.getY() < 186))) {
                    PotatoCheck = false;
                    MiddleX = 1044;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 9");
                    PotatoCheck = false;
                    MiddleX = 1159;
                    MiddleY = 80;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 186 && e.getY() < 288)) {
                    System.out.println("khune 10");
                    PotatoCheck = false;
                    MiddleX = 332;
                    MiddleY = 190;
                    handler.addObject(new Potato(MiddleX, MiddleY, ID.Sunflower));
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 11");
                    PotatoCheck = false;
                    MiddleX = 430;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 12");
                    PotatoCheck = false;
                    MiddleX = 535;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 13");
                    PotatoCheck = false;
                    MiddleX = 637;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 14");
                    PotatoCheck = false;
                    MiddleX = 740;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 186 && e.getY() < 288)) {
                    System.out.println("khune 15");
                    PotatoCheck = false;
                    MiddleX = 842;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 16");
                    PotatoCheck = false;
                    MiddleX = 941;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 17");
                    PotatoCheck = false;
                    MiddleX = 1044;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 18");
                    PotatoCheck = false;
                    MiddleX = 1159;
                    MiddleY = 190;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 10");
                    PotatoCheck = false;
                    MiddleX = 332;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 11");
                    PotatoCheck = false;
                    MiddleX = 430;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 12");
                    PotatoCheck = false;
                    MiddleX = 535;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 13");
                    PotatoCheck = false;
                    MiddleX = 637;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 14");
                    PotatoCheck = false;
                    MiddleX = 740;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 15");
                    PotatoCheck = false;
                    MiddleX = 842;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 16");
                    PotatoCheck = false;
                    MiddleX = 941;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 288 && e.getY() < 414))) {

                    PotatoCheck = false;
                    MiddleX = 1044;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 288 && e.getY() < 414))) {

                    PotatoCheck = false;
                    MiddleX = 1159;
                    MiddleY = 300;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 414 && e.getY() < 514)) {
                    System.out.println("khune 10");
                    PotatoCheck = false;
                    MiddleX = 332;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 11");
                    PotatoCheck = false;
                    MiddleX = 430;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 12");
                    PotatoCheck = false;
                    MiddleX = 535;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 13");
                    PotatoCheck = false;
                    MiddleX = 637;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 14");
                    PotatoCheck = false;
                    MiddleX = 740;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 414 && e.getY() < 514)) {
                    System.out.println("khune 15");
                    PotatoCheck = false;
                    MiddleX = 842;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 16");
                    PotatoCheck = false;
                    MiddleX = 941;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 17");
                    PotatoCheck = false;
                    MiddleX = 1044;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 18");
                    PotatoCheck = false;
                    MiddleX = 1159;
                    MiddleY = 414;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 514 && e.getY() < 623)) {
                    System.out.println("khune 10");
                    PotatoCheck = false;
                    MiddleX = 332;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 11");
                    PotatoCheck = false;
                    MiddleX = 430;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 12");
                    PotatoCheck = false;
                    MiddleX = 535;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 13");
                    PotatoCheck = false;
                    MiddleX = 637;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 14");
                    PotatoCheck = false;
                    MiddleX = 740;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 514 && e.getY() < 623)) {
                    System.out.println("khune 15");
                    PotatoCheck = false;
                    MiddleX = 842;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 43");
                    PotatoCheck = false;
                    MiddleX = 941;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 17");
                    PotatoCheck = false;
                    MiddleX = 1044;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 45");
                    PotatoCheck = false;
                    MiddleX = 1159;
                    MiddleY = 528;
                    Potato pt = new Potato(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(pt);
                    plants.add(pt);
                    Potatomade = true;
                    Settingf.SunCount = Settingf.SunCount - 50;
                    sun = System.currentTimeMillis();
                }


            }
        }


        if (PeashooterCheck == true) {
            if ((Settingf.SunCount >= 100)&& (suncooldown > 3000)) {
                PeashooterCheck = false;

                if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 55 && e.getY() < 186)) {
                    PeashooterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    //objects.put(ps,task);
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 0, 1500);

                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 55 && e.getY() < 186))) {

                    PeashooterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 0, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 3");
                    PeashooterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 0, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 4");
                    PeashooterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 5");
                    PeashooterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 835 && e.getX() < 930) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 6");
                    PeashooterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 7");
                    PeashooterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 8");
                    PeashooterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 9");
                    PeashooterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 80;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 186 && e.getY() < 288)) {
                    PeashooterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 0, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 11");
                    PeashooterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 12");
                    PeashooterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 13");
                    PeashooterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 14");
                    PeashooterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 186 && e.getY() < 288)) {
                    System.out.println("khune 15");
                    PeashooterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 16");
                    PeashooterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 17");
                    PeashooterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 18");
                    PeashooterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 190;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 10");
                    PeashooterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 11");
                    PeashooterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 12");
                    PeashooterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 13");
                    PeashooterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 14");
                    PeashooterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 15");
                    PeashooterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 16");
                    PeashooterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 17");
                    PeashooterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 18");
                    PeashooterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 300;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 414 && e.getY() < 514)) {
                    System.out.println("khune 10");
                    PeashooterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 11");
                    PeashooterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 414 && e.getY() < 514))) {
                    System.out.println("khune 12");
                    PeashooterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 414 && e.getY() < 514))) {

                    PeashooterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 414 && e.getY() < 514))) {

                    PeashooterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 414 && e.getY() < 514)) {

                    PeashooterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 414 && e.getY() < 514))) {

                    PeashooterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 414 && e.getY() < 514))) {

                    PeashooterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 414 && e.getY() < 514))) {

                    PeashooterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 414;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 514 && e.getY() < 623)) {

                    PeashooterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 514 && e.getY() < 623))) {

                    PeashooterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 514 && e.getY() < 623))) {

                    PeashooterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 514 && e.getY() < 623))) {

                    PeashooterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 514 && e.getY() < 623))) {

                    PeashooterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 514 && e.getY() < 623)) {
                    System.out.println("khune 15");
                    PeashooterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 43");
                    PeashooterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 17");
                    PeashooterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 514 && e.getY() < 623))) {
                    System.out.println("khune 45");
                    PeashooterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 528;
                    PeaShooter ps = new PeaShooter(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(ps);
                    plants.add(ps);
                    Peashmade = true;
                    Settingf.SunCount = Settingf.SunCount - 100;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(ps, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                }


            }

        }


        if (RepeaterCheck == true) {

            if ((Settingf.SunCount >= 200)&& (suncooldown > 3000)) {
                RepeaterCheck = false;

                if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 55 && e.getY() < 186)) {
                    RepeaterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {

                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 55 && e.getY() < 186))) {

                    RepeaterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 55 && e.getY() < 186))) {

                    RepeaterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY + 5, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 55 && e.getY() < 186))) {
                    ;
                    RepeaterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 5");
                    PeashooterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));

                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 835 && e.getX() < 930) && (e.getY() > 55 && e.getY() < 186))) {
                    RepeaterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 7");
                    RepeaterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 55 && e.getY() < 186))) {
                    System.out.println("khune 8");
                    RepeaterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new Repeater(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 55 && e.getY() < 186))) {
                    RepeaterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 80;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 186 && e.getY() < 288)) {
                    RepeaterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 186 && e.getY() < 288))) {
                    RepeaterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 186 && e.getY() < 288))) {
                    RepeaterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 186 && e.getY() < 288))) {
                    RepeaterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 186 && e.getY() < 288))) {
                    RepeaterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 186 && e.getY() < 288)) {
                    RepeaterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 186 && e.getY() < 288))) {
                    RepeaterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 186 && e.getY() < 288))) {
                    RepeaterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 186 && e.getY() < 288))) {
                    System.out.println("khune 18");
                    RepeaterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 190;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 288 && e.getY() < 414)) {
                    System.out.println("khune 10");
                    RepeaterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 288 && e.getY() < 414))) {
                    RepeaterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 288 && e.getY() < 414))) {
                    RepeaterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 288 && e.getY() < 414))) {
                    RepeaterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 288 && e.getY() < 414))) {
                    RepeaterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 288 && e.getY() < 414)) {
                    RepeaterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 288 && e.getY() < 414))) {
                    RepeaterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 288 && e.getY() < 414))) {
                    System.out.println("khune 17");
                    RepeaterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 288 && e.getY() < 414))) {
                    RepeaterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 300;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 414 && e.getY() < 514)) {
                    System.out.println("khune 10");
                    RepeaterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 414 && e.getY() < 514))) {
                    RepeaterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 414 && e.getY() < 514))) {
                    RepeaterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 414 && e.getY() < 514))) {

                    RepeaterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 414 && e.getY() < 514))) {

                    RepeaterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 414 && e.getY() < 514)) {

                    RepeaterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 414 && e.getY() < 514))) {

                    RepeaterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 414 && e.getY() < 514))) {

                    RepeaterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 414 && e.getY() < 514))) {

                    RepeaterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 414;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 322 && e.getX() < 422) && (e.getY() > 514 && e.getY() < 623)) {

                    RepeaterCheck = false;
                    int MiddleX = 332;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 426 && e.getX() < 515) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 430;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 520 && e.getX() < 630) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 535;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 630 && e.getX() < 725) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 637;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 725 && e.getX() < 835) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 740;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if ((e.getX() > 835 && e.getX() < 930) && (e.getY() > 514 && e.getY() < 623)) {
                    System.out.println("khune 15");
                    RepeaterCheck = false;
                    int MiddleX = 842;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 930 && e.getX() < 1032) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 941;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1032 && e.getX() < 1137) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 1044;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                } else if (((e.getX() > 1137 && e.getX() < 1242) && (e.getY() > 514 && e.getY() < 623))) {

                    RepeaterCheck = false;
                    int MiddleX = 1159;
                    int MiddleY = 528;
                    Repeater rc = new Repeater(MiddleX, MiddleY, ID.Sunflower);
                    handler.addObject(rc);
                    plants.add(rc);
                    Repeatermade = true;
                    Settingf.SunCount = Settingf.SunCount - 200;
                    TimerTask task = new TimerTask() {


                        @Override
                        public void run() {
                            handler.addObject(new pea(MiddleX, MiddleY, ID.pea));
                            handler.addObject(new pea(MiddleX + 5, MiddleY, ID.pea));
                        }
                    };
                    PeaShooters.put(rc, task);
                    timer.scheduleAtFixedRate(task, 1, 1500);
                    sun = System.currentTimeMillis();
                }


            }
        }


        if ((e.getX() > 15 && e.getX() < 130) && (e.getY() > 150) && (e.getY() < 253)) {
            System.out.println("sunflower");
            SunfCheck = true;

        } else if ((e.getX() > 15 && e.getX() < 130) && (e.getY() > 262) && (e.getY() < 365)) {
            System.out.println("peashooter");
            PeashooterCheck = true;
        } else if ((e.getX() > 15 && e.getX() < 130) && (e.getY() > 375) && (e.getY() < 472)) {
            System.out.println("potato");
            PotatoCheck = true;
        } else if ((e.getX() > 15 && e.getX() < 130) && (e.getY() > 490) && (e.getY() < 580)) {
            System.out.println("repeater");
            RepeaterCheck = true;
        }


    }


}
