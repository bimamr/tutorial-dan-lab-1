package L1Q4;

public class L1Q4 {
    public static void main(String[] args) {
        String[] months = {
            "January 2016", 
            "February 2016", 
            "March 2016", 
            "April 2016", 
            "May 2016", 
            "Jun 2016"
        };
        int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};
        
        System.out.println("==========================================================================");
        System.out.println("                   BAR CHART: TOTAL SALES OF PRODUCT A                    ");
        System.out.println("                     Scale: Each '*' represents 100                       ");
        System.out.println("==========================================================================");
        System.out.println();
        
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-14s | ", months[i]);
            int barLength = amounts[i] / 100;
            for (int b = 0; b < barLength; b++) {
                System.out.print("*");
            }
            System.out.printf(" (%d)\n", amounts[i]);
        }
        
        System.out.println("---------------+----------------------------------------------------------");
        System.out.println("               | 0    500   1000  1500  2000  2500  3000  3500");
        System.out.println("==========================================================================");
    }
}
