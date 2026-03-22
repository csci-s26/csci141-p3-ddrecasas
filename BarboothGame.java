import java.util.Random;
import java.util.Scanner;

public class BarboothGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("-- Barbooth dice-rolling game with two players --");
        System.out.println();

        // TODO 1: Ask for both player names
        System.out.println("Player 1, please enter your name: ");
        String player1 = input.nextLine();
        System.out.println("Player 2, please enter your name: ");
        String player2 = input.nextLine();

     // TODO 2: Roll one die for each player until one player gets a higher number
        String shooter = "";
        String fader = "";

        int roll1, roll2;
        do {
            System.out.print(player1 + ", please enter 'r' to roll: ");
            input.nextLine();
            roll1 = rollDie(rand);
            System.out.println(player1 + ": " + roll1);

            System.out.print(player2 + ", please enter 'r' to roll: ");
            input.nextLine();
            roll2 = rollDie(rand);
            System.out.println(player2 + ": " + roll2);
        } while (roll1 == roll2);

        if (roll1 > roll2) {
            shooter = player1;
            fader = player2;
        } else {
            shooter = player2;
            fader = player1;
        }
        System.out.println(shooter + " starts first.");

        // TODO 3: Let the shooter roll two dice
        System.out.print(shooter + ", please enter 'r' to roll: ");
        input.nextLine();
        int die1 = rollDie(rand);
        int die2 = rollDie(rand);
        System.out.println(shooter + ": " + die1 + " - " + die2);

        // TODO 4: Check whether the shooter wins, loses, or the fader gets a turn
        if (isWinningRoll(die1, die2)) {
            System.out.println(shooter + " wins!");
        } else if (isLosingRoll(die1, die2)) {
            System.out.println(fader + " wins!");
        } else {
        	
        }
        // TODO 5: If needed, let the fader roll two dice

        // TODO 6: Display the final result: shooter wins, fader wins, or tie

        input.close();
    }

    public static int rollDie(Random rand) {
        return rand.nextInt(6) + 1; //TODO
    }

    public static boolean isWinningRoll(int die1, int die2) {
    	 int[][] winningRolls = {{3,3}, {5,5}, {6,6}, {6,5}, {5,6}};
    	    for (int[] combo : winningRolls) {
    	        if ((die1 == combo[0] && die2 == combo[1]) || (die1 == combo[1] && die2 == combo[0])) {
    	            return true;
    	        }
    	    }
    		return false; // TODO
    }

    public static boolean isLosingRoll(int die1, int die2) {
    	 int[][] losingRolls = {{1,1}, {2,2}, {4,4}, {1,2}};
    	    for (int[] combo : losingRolls) {
    	        if ((die1 == combo[0] && die2 == combo[1]) || (die1 == combo[1] && die2 == combo[0])) {
    	            return true;
    	        }
    	    }
    	return false; // TODO
    }
}
