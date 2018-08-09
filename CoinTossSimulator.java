// Name: Ekachai Suriyakriengkri
// USC NetID: 3255092347
// CS 455 PA1
// Spring 2018

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

import java.util.Random;

public class CoinTossSimulator {

    private int twoHeads;
    private int twoTails;
    private int headTails;
    private int numTrials;
    /**
		Creates a coin toss simulator with no trials done yet.
     */
    public CoinTossSimulator() {
        twoHeads = 0;
        twoTails = 0;
        headTails = 0;
        numTrials = 0;
    }


    /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.

      @param numTrials  number of trials to for simulation; must be >= 1
     */
    public void run(int numTrials) {

        this.numTrials = this.numTrials + numTrials;
        Random rand = new Random();		

        for (int i=0; i< numTrials; i++)
        {
            int firstCoin = rand.nextInt(2);
            int secondCoin = rand.nextInt(2);

            if (firstCoin == 0 && secondCoin == 0)
            {
                this.twoHeads++;
            }
            else if (firstCoin == 1 && secondCoin == 1)
            {
                this.twoTails++;
            }
            else
            {
                this.headTails++;
            }
        }
    }


    /**
      Get number of trials performed since last reset.
     */
    public int getNumTrials() {
        return this.numTrials;
    }


    /**
      Get number of trials that came up two heads since last reset.
     */
    public int getTwoHeads() {
        return this.twoHeads;
    }


    /**
     Get number of trials that came up two tails since last reset.
     */  
    public int getTwoTails() {
        return this.twoTails;
    }


    /**
     Get number of trials that came up one head and one tail since last reset.
     */
    public int getHeadTails() {
        return this.headTails;
    }


    /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
     */
    public void reset() {
        twoHeads = 0;
        twoTails = 0;
        headTails = 0;
        numTrials = 0;
    }

}