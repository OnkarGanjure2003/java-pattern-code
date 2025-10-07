package Lecture4;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        //logic 1
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row-i;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* " );
//            }
//            System.out.println();
//        }
//        for(int i=row;i>1;i--){
//            for(int j=i;j<=row;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=2*i-3;j++){
//                System.out.print("* " );
//            }
//            System.out.println();
//        }

        //logic 2
        int nsp=row-1;
        int nst=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* " );
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp=1;
        nst=2*row-3;
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* " );
            }
            nsp++;
            nst-=2;
            System.out.println();
        }

      }
}
