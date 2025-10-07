package Lecture4;
import java.util.Scanner;
public class ReverseKPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        for(int i=1;i<=2*row-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp=1;
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=row-i;j++){
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }

    }
}
