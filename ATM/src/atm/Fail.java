package atm;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fail {
    public void failView(String str) {
        Commons commons = new Commons();
        JFrame frame =(JFrame) commons.Frame();

        //-----------------FAIL------------------
        JLabel fail = new JLabel("YOUR TRANSACTIONS FAILED!!!");
        fail.setBounds(0, 280, 600, 50);
        fail.setHorizontalAlignment(JLabel.CENTER);
        fail.setFont(new Font("Rockwell", Font.BOLD, 25));
        JLabel st = new JLabel(str);
        st.setBounds(0, 320, 600, 50);
        st.setHorizontalAlignment(JLabel.CENTER);
        st.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(st);
        frame.add(fail);
        //-----------------------------------------
        Font tx = new Font("", Font.BOLD, 15);
        JLabel close = new JLabel("CLOSE >>");
        close.setBounds(0, 500, 570, 30);
        close.setHorizontalAlignment(JLabel.RIGHT);
        close.setFont(tx);
        frame.add(close);
        close.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Login login = new Login();
                login.loginView();
                frame.dispose();
            }
        });
        //-------------------------------------------

        frame.setVisible(true);
    }
}