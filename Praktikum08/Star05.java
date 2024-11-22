package Praktikum08;
import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc05.nextInt();

        for (int i=1; i > N; i++) {
            System.out.print("*");
        }

        sc05.close();
    }
}
