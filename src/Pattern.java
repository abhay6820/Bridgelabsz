import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the no of rows: ");
//        int rows = input.nextInt();
        int rows = 4;
        printReverseRightHalfPyramid(rows);
    }
    public static void printReverseRightHalfPyramid(int rows) {
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
