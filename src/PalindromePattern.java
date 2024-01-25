import java.util.Scanner;
public class PalindromePattern {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {//increases rows{
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
//                System.out.print("          ");i=1
//                System.out.print("        ");i=2
            }
            for (int k = i; k >= 1; k--) {
                System.out.print( k+ " ");
//                System.out.println("1 ");i=1
//                System.out.println("2 1 ");i=2
            }
            for (int l = 2; l <= i; l++) {
                System.out.print( l+ " " );
//              System.out.println("2 ");i=2
//                System.out.println("2 3 ");i=3
            }
            System.out.println();
        }
    }
}


