package Lecture4;
import java.util.Scanner;
public class StarReverseRightHalfPyramidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<row;i++){
//            for(int j=row-i;j>0;j--){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
    }
}
