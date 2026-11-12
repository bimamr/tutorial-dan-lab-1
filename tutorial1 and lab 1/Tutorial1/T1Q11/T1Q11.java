package T1Q11;

import java.util.Random;

public class T1Q11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[5];
        
        System.out.print("Generated random numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = rand.nextInt(100) + 1; // 1 - 100
            System.out.print(numbers[i] + (i < 4 ? ", " : "\n"));
        }
        
        // Bubble sort in descending order
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Numbers in descending order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < 4 ? ", " : "\n"));
        }
    }
}
