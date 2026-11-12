package T1Q7;

import java.util.Random;

public class T1Q7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("10 Random Numbers (10 to 100):");
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(91) + 10;
            System.out.print(num + (i < 9 ? ", " : "\n"));
            
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
