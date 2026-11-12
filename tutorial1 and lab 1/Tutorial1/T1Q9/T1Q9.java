package T1Q9;

import java.util.Scanner;

public class T1Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter webpage text / content:");
        String webPageContent = scanner.nextLine();
        
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();
        
        int frequency = 0;
        if (!keyword.trim().isEmpty()) {
            int index = 0;
            String lowerContent = webPageContent.toLowerCase();
            String lowerKeyword = keyword.toLowerCase();
            
            while ((index = lowerContent.indexOf(lowerKeyword, index)) != -1) {
                frequency++;
                index += lowerKeyword.length();
            }
        }
        
        System.out.println("Frequency of keyword \"" + keyword + "\": " + frequency);
        
        scanner.close();
    }
}
