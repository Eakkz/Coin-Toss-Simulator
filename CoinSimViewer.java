// Name: Ekachai Suriyakriengkri
// USC NetID: 3255092347
// CS 455 PA1
// Spring 2018

// Import java library 
import java.util.Scanner;
import javax.swing.JFrame;

public class CoinSimViewer {

    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of trials: ");
        int numTrials = in.nextInt();

        //Validating the input, the input must more than 0
        while (!(numTrials > 0))
        {
            System.out.println("ERROR: Number entered must be greater than 0.");
            System.out.println("Enter number of trials: ");
            numTrials = in.nextInt();
        }

        //Draw 800 * 500 Frame with "CoinSim" name
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setTitle("CoinSim");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CoinSimComponent component = new CoinSimComponent(numTrials);
        frame.add(component);

        frame.setVisible(true);

    }

}
