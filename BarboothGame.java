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
        int die1 = 0;
        int die2 = 0;

        // TODO 4: Check whether the shooter wins, loses, or the fader gets a turn

        // TODO 5: If needed, let the fader roll two dice

        // TODO 6: Display the final result: shooter wins, fader wins, or tie

        input.close();
    }

    public static int rollDie(Random rand) {
        return rand.nextInt(6) + 1; //TODO
    }

    public static boolean isWinningRoll(int die1, int die2) {
        return false; // TODO
    }

    public static boolean isLosingRoll(int die1, int die2) {
        return false; // TODO
    }
}
