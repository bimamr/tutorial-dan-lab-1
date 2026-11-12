package T1Q12;

import java.util.Random;
import java.util.Scanner;

public class T1Q12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int target = rand.nextInt(100) + 1; // 1 - 100
        int guess = 0;
        int attempts = 0;
        
        System.out.println("=== Guess the Number Game ===");
        System.out.println("I have chosen a random number between 1 and 100. Try to guess it!");
        
        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + target + " in " + attempts + " attempts!");
            }
        }
        
        scanner.close();
    }
}
