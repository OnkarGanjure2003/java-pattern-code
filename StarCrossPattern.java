package Lecture4;
import java.util.Scanner;
public class StarCrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rowcol: ");
        int rowcol = sc.nextInt();
        for (int i = 0; i <rowcol; i++) {
            for (int j = 0; j <rowcol; j++) {
                if (i == j || i+j == rowcol-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

