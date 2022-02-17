import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settingf extends JFrame {
    public JPanel panel1;
    private JButton BACKButton;
    private JTextField DoralField;
    private JTextField SunField;
    private JTextField ZombielField3;
    private JButton APPLYButton;
    public static int ZombieCount=2,SunCount=120,DoralCount=5;

    public Settingf() {


        APPLYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           String nz,ns,nd;
           nz= ZombielField3.getText();
           ns=SunField.getText();
           nd= DoralField.getText();
                 ZombieCount = Integer.parseInt(nz);
                 SunCount = Integer.parseInt(ns);
                 DoralCount = Integer.parseInt(nd);
                System.out.println(ZombieCount);
            }
        });


        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                First.mf.setSize(700, 700);
                First.mf.setVisible(true);
                First.mf.setLocationRelativeTo(null);
                First.mf.setContentPane(First.mf.panel1);
                Menuf.sf.dispose();
                Menuf.sf.setVisible(true);

            }
        });

    }
}
