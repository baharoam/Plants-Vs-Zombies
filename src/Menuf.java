import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menuf extends JFrame {
    public JPanel panel1;
    private JButton a1STARTButton;
    private JButton a2SETTINGButton;
    private JButton a3EXITButton;
    public static Settingf sf = new Settingf();
    public Menuf() {
        a1STARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First.mf.dispose();
                First.mf.setVisible(false);
                new First();
            }
        });


        a2SETTINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First.mf.dispose();
                First.mf.setVisible(false);

                sf.setSize(700, 700);
                sf.setVisible(true);
                sf.setLocationRelativeTo(null);
                sf.setContentPane(sf.panel1);
            }
        });


        a3EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First.mf.dispose();
                First.mf.setVisible(false);
            }
        });
    }
}
