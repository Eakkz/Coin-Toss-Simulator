// Name: Ekachai Suriyakriengkri
// USC NetID: 3255092347
// CS 455 PA1
// Spring 2018

public class CoinTossSimulatorTester {


    //Method for validating total of trials = sum of number of the two heads, two tails, and one head one tail
    public static String validate(int twoHeads, int twoTails, int headTails, int numTrials) {
        /* if statement is true, return string "true"
         * if statement is false, return string "false"
         */
        if (numTrials == twoHeads + twoTails + headTails)    
            return "true";
        else
            return "false";

    }

    public static void main(String[] args) {

        CoinTossSimulator test = new CoinTossSimulator();

        System.out.println("After constructor:");
        System.out.println("Number of trials [exp:0]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(1);
        System.out.println("After run(1):");
        System.out.println("Number of trials [exp:1]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(10);
        System.out.println("After run(10):");
        System.out.println("Number of trials [exp:11]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(100);
        System.out.println("After run(100):");
        System.out.println("Number of trials [exp:111]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(500);
        System.out.println("After run(500):");
        System.out.println("Number of trials [exp:611]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(1500);
        System.out.println("After run(1500):");
        System.out.println("Number of trials [exp:2111]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(5000);
        System.out.println("After run(5000):");
        System.out.println("Number of trials [exp:7111]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(10000);
        System.out.println("After run(10000):");
        System.out.println("Number of trials [exp:17111]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.reset(); //reset
        System.out.println("After reset:");
        System.out.println("Number of trials [exp:0]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(1000);
        System.out.println("After run(1000):");
        System.out.println("Number of trials [exp:1000]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(5000);
        System.out.println("After run(5000):");
        System.out.println("Number of trials [exp:6000]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(100000);
        System.out.println("After run(100000):");
        System.out.println("Number of trials [exp:106000]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(1000000);
        System.out.println("After run(1000000):");
        System.out.println("Number of trials [exp:1106000]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.reset(); //reset
        System.out.println("After reset:");
        System.out.println("Number of trials [exp:0]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();

        test.run(1000000);
        System.out.println("After run(1000000):");
        System.out.println("Number of trials [exp:1000000]: " + test.getNumTrials());
        System.out.println("Two-head tosses: " + test.getTwoHeads());
        System.out.println("Two-tail tosses: " + test.getTwoTails());
        System.out.println("One-head one-tail tosses: " + test.getHeadTails());
        System.out.println("Tosses add up correctly? " + validate(test.getTwoHeads(), test.getTwoTails(), test.getHeadTails(),test.getNumTrials()));
        System.out.println();
    }


}
