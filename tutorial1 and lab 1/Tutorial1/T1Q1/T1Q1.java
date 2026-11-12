package T1Q1;

import java.util.Scanner;

public class T1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double product = num1 * num2;
        
        System.out.println("Multiplication result: " + product);
        
        scanner.close();
    }
}
