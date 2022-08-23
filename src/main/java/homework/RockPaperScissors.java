package homework;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';

        while (runAgain == 'y'){

        System.out.println("Player 1 choose rock, paper or scissors");
        String player1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Player 2 choose rock, paper or scissors");
        String player2 = scanner.nextLine().trim().toLowerCase();

        if (player1.equals(player2)) {
            System.out.println("TRIM");
        }
        if (player1.equals("rock") && player2.equals("scissors") || player1.equals("scissors") && player2.equals("paper") || player1.equals("paper") && player2.equals("rock")){
            System.out.println("Player 1 wins");
        }
        if (player2.equals("rock") && player1.equals("scissors") || player2.equals("scissors") && player1.equals("paper") || player2.equals("paper") && player1.equals("rock")) {
            System.out.println("Player 2 wins");
        }
            System.out.println("Do you want to play again? y/n");
            runAgain = scanner.next().charAt(0);
            scanner.nextLine();
        }


    }
}
