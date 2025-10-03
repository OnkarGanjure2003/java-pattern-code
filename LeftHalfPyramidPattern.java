package Lecture4;
import java.util.Scanner;
public class LeftHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row;j++) {
                //logic 1
//                if(j>=row-i+1) {
//                    System.out.print("*" + " ");
//                }
//                else{
//                    System.out.print("  ");
//                }

                //logic 2
//                if(i+j>row){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }

                //logic 3
                for(int i=1;i<=row;i++){
                    for(int j=1;j<=row-i;j++){
                        System.out.print("  ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }


