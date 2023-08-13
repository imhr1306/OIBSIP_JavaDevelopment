package atm;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Success {
    public void successView(int id) throws SQLException {
        Home home = new Home();
        Commons commons = new Commons();
        JFrame frame =(JFrame) commons.Frame();

        //-----------------SUCCESS------------------
        JLabel sucss = new JLabel("TRANSACTION SUCCESSFUL.");
        sucss.setBounds(0, 280, 600, 50);
        sucss.setHorizontalAlignment(JLabel.CENTER);
        sucss.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(sucss);
        //-----------------------------------------
        home.homeView(id);
        frame.setVisible(true);
    }

    public void detailView(String num, String pin) {
        Commons commons = new Commons();
        JFrame frame =(JFrame) commons.Frame();

        //-----------------DETAILS------------------
        JLabel sucss = new JLabel("REMEMBER THE DETAILS!!!");
        sucss.setBounds(0, 200, 600, 50);
        sucss.setHorizontalAlignment(JLabel.CENTER);
        sucss.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(sucss);
        JTextField number = new JTextField("CARD NUMBER : " + num);
        number.setBounds(0, 300, 600, 50);
        number.setEditable(false);
        number.setHorizontalAlignment(JLabel.CENTER);
        number.setFont(new Font("Rockwell", Font.BOLD, 20));
        frame.add(number);
        JTextField pinno = new JTextField("DEFAULT PIN : " + pin);
        pinno.setBounds(0, 400, 600, 50);
        pinno.setHorizontalAlignment(JLabel.CENTER);
        pinno.setEditable(false);
        pinno.setFont(new Font("Rockwell", Font.BOLD, 20));
        frame.add(pinno);
        //-----------------------------------------
        Font txt = new Font("", Font.BOLD, 15);
        JLabel back = new JLabel("BACK >");
        back.setBounds(0, 500, 570, 30);
        back.setHorizontalAlignment(JLabel.RIGHT);
        back.setFont(txt);
        frame.add(back);
        back.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Admin admin = new Admin();
                admin.adminView();
                frame.setVisible(false);
            }
        });
        //------------------------------------------
        frame.setVisible(true);
    }
}