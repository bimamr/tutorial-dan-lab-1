package T1Q4;

import java.util.Random;

public class T1Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int player1Dice = rand.nextInt(6) + 1; // 1 - 6
        int player2Dice = rand.nextInt(6) + 1; // 1 - 6
        
        System.out.println("Player 1 rolled: " + player1Dice);
        System.out.println("Player 2 rolled: " + player2Dice);
        
        if (player1Dice > player2Dice) {
            System.out.println("Result: Player 1 wins!");
        } else if (player2Dice > player1Dice) {
            System.out.println("Result: Player 2 wins!");
        } else {
            System.out.println("Result: It's a draw (tie)!");
        }
    }
}
