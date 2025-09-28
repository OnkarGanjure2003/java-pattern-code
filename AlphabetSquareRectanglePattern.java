package Lecture4;
import java.util.Scanner;
public class AlphabetSquareRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter No of columns: ");
        int col = sc.nextInt();
        for (int i = 0; i < row; i++) {
            //for capital character
            for (int j=1; j <= col; j++) {
                System.out.print( (char)(j+64)+" ");
            }
            //for small character
//            for (int j=1; j <= col; j++) {
//                System.out.print( (char)(j+96)+" ");
//            }
            System.out.println();
        }
    }
}
