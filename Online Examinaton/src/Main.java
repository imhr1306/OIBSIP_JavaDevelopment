import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {

            Login form = new Login();
            form.setSize(400, 150);
            form.setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}



