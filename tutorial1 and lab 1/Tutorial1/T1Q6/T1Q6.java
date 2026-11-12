package T1Q6;

import java.util.Random;

public class T1Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        
        System.out.println("10 Random Numbers Generated:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100) + 1; // 1 - 100
            System.out.print(numbers[i] + (i < 9 ? ", " : "\n"));
        }
        
        int min = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Minimum number: " + min);
    }
}
