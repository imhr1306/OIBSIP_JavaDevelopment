package atm;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Commons {
    public Component Frame() {
        JFrame frame = new JFrame("ATM");
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\HR Project\\Oasis Infobyte\\ATM\\logo.jpg");
        frame.setIconImage(icon);
        frame.setLayout(null);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.decode("#D2B48C"));

        //------------------LOGO----------------------------------
        JLabel atm = new JLabel("ATM");
        atm.setBounds(0, 30, 600, 120);
        atm.setHorizontalAlignment(JLabel.CENTER);
        atm.setFont(new Font("Monospaced", Font.BOLD, 120));
        JLabel man = new JLabel("MANAGEMENT SYSTEM");
        man.setBounds(0, 140, 600, 20);
        man.setHorizontalAlignment(JLabel.CENTER);
        man.setFont(new Font("Monospaced", Font.BOLD, 20));
        frame.add(man);
        frame.add(atm);
        //-----------------------------------------------
        return frame;
    }
}