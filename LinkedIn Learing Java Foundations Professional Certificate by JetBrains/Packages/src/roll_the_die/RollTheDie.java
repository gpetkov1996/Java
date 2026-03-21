package roll_the_die;

import java.util.Random;

public class RollTheDie {
    public static void main(String[] args) {

        /***************************************************
         Change these boolean values to control whether you see
         the expected result and/or hints.
         ****************************************************/
        boolean showExpectedResult = false;
        boolean showHints = false;

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        int row = 0;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        int die = 0;

        while(row < maxRolls){
            if(currentSpace == lastSpace){
                break;
            }

            die = random.nextInt(6) + 1;
            System.out.println(die);
            currentSpace = currentSpace + die;
            row++;
        }

        if(currentSpace > lastSpace){
            System.out.println(String.format(tooHigh, currentSpace));
        } else if (currentSpace < lastSpace) {
            System.out.println(String.format(tooLow, currentSpace));
        } else {
            System.out.println(String.format(justRight, currentSpace));
        }
    }
}
