//9
public class StarPattern {
    public static void main(String[] args) {
        int rows = 4; 
        for (int i = 0; i <= rows / 2; i++) {
            for (int j = 0; j < rows / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            if (i != rows / 2) {
                for (int l = 0; l < (rows % 2 == 0 ? 1 : 0); l++) {
                    System.out.print(" ");
                }}
            if (i != 0 && rows % 2 == 0) {
                for (int m = 0; m < 2 * (rows / 2 - i) - 1; m++) {
                    System.out.print("*");
                }}}
        for (int i = rows / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < rows / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }}}
