import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends Canvas {

    private static final long serialVersionUID = -6792552159372506926L;
     static JFrame frame;
     JLabel label1 = new JLabel();
    public Window(int width, int height, String title, First game) {
        frame = new JFrame(title); //we created jframe
        frame.setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null); //frame starts in the middle of the screen
        frame.add(game);
        frame.setSize(1300, 700);
        label1.setText(String.valueOf(Settingf.SunCount));
        label1.setBounds(500,500,400,400);

        frame.setVisible(true);
        game.strat();

    }


}



/*




          JPanel panel = new JPanel();
          JLabel label;

    frame.getContentPane();


    panel.setLayout(null);

    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.add(panel);






 */