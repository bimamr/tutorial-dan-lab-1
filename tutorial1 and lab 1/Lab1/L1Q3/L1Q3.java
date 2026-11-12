package L1Q3;

public class L1Q3 {
    public static void main(String[] args) {
        // Loop untuk 9 baris (row 0 sampai 8)
        for (int r = 0; r < 9; r++) {
            
            // 1. Gambar BOX (9x9)
            for (int c = 0; c < 9; c++) {
                if (r == 0 || r == 8 || c == 0 || c == 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // 2. Gambar OVAL (9x9)
            for (int c = 0; c < 9; c++) {
                if ((r == 0 || r == 8) && (c >= 3 && c <= 5)) {
                    System.out.print("*");
                } else if ((r == 1 || r == 7) && (c == 1 || c == 7)) {
                    System.out.print("*");
                } else if ((r >= 2 && r <= 6) && (c == 0 || c == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");


            for (int c = 0; c < 9; c++) {
                if (r == 0 && c == 4) {
                    System.out.print("*");
                } else if (r == 1 && (c >= 3 && c <= 5)) {
                    System.out.print("*");
                } else if (r == 2 && (c >= 2 && c <= 6)) {
                    System.out.print("*");
                } else if (r >= 3 && c == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // 4. Gambar DIAMOND (9x9)
            for (int c = 0; c < 9; c++) {
                if (Math.abs(r - 4) + Math.abs(c - 4) == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Pindah ke baris baru
            System.out.println();
        }
    }
}