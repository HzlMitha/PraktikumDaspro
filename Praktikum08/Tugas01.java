package Praktikum08;
import java.util.Scanner;

public class Tugas01 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc05.nextInt();

        if (N < 3 ) {
            System.out.println("Nilai N harus minimal 3");
            return;
        }

        //outer loop
        for (int i = 1; i <= N; i++) {
            //inner loop
            for (int j = 1; j <= N; j++) {

                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc05.close();
    }
}
