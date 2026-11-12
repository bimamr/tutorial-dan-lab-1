package T1Q2;

import java.util.Random;

public class T1Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // 1 - 100
        
        System.out.println("Generated random number: " + randomNumber);
        
        if (randomNumber > 50) {
            System.out.println(randomNumber + " is greater than 50.");
        } else if (randomNumber == 50) {
            System.out.println(randomNumber + " is equal to 50.");
        } else {
            System.out.println(randomNumber + " is NOT greater than 50.");
        }
    }
}
