package Praktikum08;
import java.util.Scanner;

public class Square05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc05.nextInt();

        //outer loop
        for (int iOuter=1; iOuter<=N; iOuter++){
            //inner loop
            for (int i=1; i<= N; i++) {
            System.out.print("*");
            }
        System.out.println();

        }

        sc05.close();
    }
}
