package T1Q8;

import java.util.Scanner;

public class T1Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int countU = 0;
        int countM = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toUpperCase(sentence.charAt(i));
            if (ch == 'U') {
                countU++;
            } else if (ch == 'M') {
                countM++;
            }
        }
        
        System.out.println("Frequency of alphabet 'U' (case-insensitive): " + countU);
        System.out.println("Frequency of alphabet 'M' (case-insensitive): " + countM);
        
        scanner.close();
    }
}
