import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {

    void game() {
        int startingNumber = 1;
        int endingNumber = 100;

        int Attempts = 5;
        int score = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(endingNumber - startingNumber + 1) + startingNumber;

        for (int i = startingNumber; i <= Attempts; i++) {

            String number = JOptionPane.showInputDialog("Guess the number between " + startingNumber + " and " + endingNumber + ":");
            int guessNumber = Integer.parseInt(number);

            if (guessNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations!!!! You've guessed the right number : " + guessNumber + " in " + i + " attempts.");
                score = Attempts - i + 1;
                break;
            }
            else if (guessNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "Your guess number is lower than random number. Try again. " + ( Attempts - i ) + " Attempts Left.");
            }
            else {
                    JOptionPane.showMessageDialog(null, "Your guess number is higher than random number. Try again."  + ( Attempts - i ) + " Attempts Left.");
                }

        }

        if(score > 0){
            JOptionPane.showMessageDialog(null, "Your final score is: " + score + "  🎯");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your final score is: " + score + "  ❌");
        }
        int ch = JOptionPane.showConfirmDialog(null, "Do you want to retry ?","Confirmation", JOptionPane.YES_NO_OPTION);
        if(ch==JOptionPane.YES_OPTION)
            {
                game();
            }
        else if(ch==JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Thanks For Playing The Game");
            }

    }
    public static void main(String[] args)
        {
            JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!!!!");
            NumberGuessingGame ob = new NumberGuessingGame();
            ob.game();
        }
}