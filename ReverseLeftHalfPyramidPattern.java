package Lecture4;
import java.util.Scanner;
public class ReverseLeftHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=row+1-i;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
