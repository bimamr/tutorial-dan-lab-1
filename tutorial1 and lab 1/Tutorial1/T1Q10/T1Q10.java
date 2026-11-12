package T1Q10;

import java.util.Random;

public class T1Q10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalStudents = 100;
        int femaleCount = 0;
        int maleCount = 0;
        
        for (int i = 1; i <= totalStudents; i++) {
            int gender = rand.nextInt(2); // 0 or 1
            if (gender == 1) {
                femaleCount++;
            } else {
                maleCount++;
            }
        }
        
        System.out.println("Total students surveyed : " + totalStudents);
        System.out.println("Number of female students: " + femaleCount);
        System.out.println("Number of male students  : " + maleCount);
    }
}
