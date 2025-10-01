package Lecture4;
import java.util.Scanner;
public class NumAlphabetRightAngledTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print((char) (j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
