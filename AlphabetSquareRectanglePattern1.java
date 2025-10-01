package Lecture4;
import java.util.Scanner;
public class AlphabetSquareRectanglePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter No of columns: ");
        int col = sc.nextInt();
        for(int i=65;i<=row+65;i++){
            for(int j=1;j<=col;j++){
                System.out.print((char) i+" ");
            }
            System.out.println();
        }
    }
}
