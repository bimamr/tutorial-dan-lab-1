package T1Q3;

import java.util.Scanner;

    
public class T1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student mark (0 - 100): ");
        double mark = scanner.nextDouble();
        
        if (mark >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        
        scanner.close();
    }
}
