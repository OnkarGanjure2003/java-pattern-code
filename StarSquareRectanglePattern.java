package Lecture4;
import java.util.Scanner;
public class StarSquareRectanglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter No of columns: ");
        int col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
