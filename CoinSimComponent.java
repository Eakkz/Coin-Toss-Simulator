// Name: Ekachai Suriyakriengkri
// USC NetID: 3255092347
// CS 455 PA1
// Spring 2018

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CoinSimComponent extends JComponent{

    //Constant variable declaration
    private static final double BUFFER_FRAME = 0.1; //BUFFER_FRAME for shifting the height of frame 10%

    //Instance variable declaration
    private int twoHeads;
    private int twoTails;
    private int headTails;
    private int numTrials;

    public CoinSimComponent (int numTrials) {

        CoinTossSimulator coinToss = new CoinTossSimulator();

        //Run coin simulation
        coinToss.run(numTrials);

        this.twoHeads = coinToss.getTwoHeads();
        this.twoTails = coinToss.getTwoTails();
        this.headTails = coinToss.getHeadTails();
        this.numTrials = coinToss.getNumTrials();  

    }
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Local variables for bar scaling
        int frameHeight = getHeight();
        int frameWidth = getWidth();
        int bottom = (int) (frameHeight - (frameHeight * BUFFER_FRAME)); //Vertical BUFFER_FRAME shift from frame width by 10%
        int width = (int) (frameWidth * BUFFER_FRAME); //Bar width 10% of frame width
        int twoHeadsWidth = (frameWidth / 4) - (width / 2); //Positioning the first bar at 25% of x axis (origin on x axis for bar)
        int headTailsWidth = (frameWidth / 2) - (width / 2); //Positioning the second bar at 50% of x axis (origin on x axis for bar)
        int twoTailsWidth = (frameWidth / 4) * 3 - (width / 2); //Positioning the third bar at 75% of x axis (origin on x axis for bar)

        //Scale for drawing rectangle
        //Shift each side 10% 
        double scale = (double) this.numTrials / (frameHeight - (frameHeight * 2 * BUFFER_FRAME));

        // Local variables for label
        int twoHeadsPercent = (int) ((this.twoHeads * 100.0) / this.numTrials); //Calculate percentage of output for two heads
        int twoTailsPercent = (int) ((this.twoTails * 100.0) / this.numTrials); //Calculate percentage of output for two tails
        int headTailsPercent = (int) ((this.headTails * 100.0) / this.numTrials); //Calculate percentage of output for a head and a tail
        //Text label for each bar
        String twoHeadsLabel = "Two Heads: " + this.twoHeads + " (" + twoHeadsPercent + "%)";
        String headTailsLabel = "A Head and a Tail: " + this.headTails + " (" + headTailsPercent + "%)";
        String twoTailsLabel = "Two Heads: " + this.twoTails + " (" + twoTailsPercent + "%)";

        Bar twoHeadsBar = new Bar (bottom, twoHeadsWidth, width, this.twoHeads, scale, Color.RED, twoHeadsLabel);
        Bar headTailsBar = new Bar (bottom, headTailsWidth, width, this.headTails, scale, Color.GREEN, headTailsLabel);
        Bar twoTailsBar = new Bar (bottom, twoTailsWidth, width, this.twoTails, scale, Color.BLUE, twoTailsLabel);

        //Draw diagram
        twoHeadsBar.draw(g2);
        headTailsBar.draw(g2);
        twoTailsBar.draw(g2);

    }
}
