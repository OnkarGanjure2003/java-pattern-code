package Lecture4;
import java.util.Scanner;
public class AlphabetRRHPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row+1-i;j++){
//                System.out.print((char) (j+96)+" ");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row+1-i;j++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println();
        }
    }
}
