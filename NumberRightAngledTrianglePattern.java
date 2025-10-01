package Lecture4;
import java.util.Scanner;
public class NumberRightAngledTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
