package Praktikum08;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc05.nextInt();

        if (N < 3 ) {
            System.out.println("Nilai N harus minimal 3");
            return;
        }

        //outer loop
        for (int i = 0; i < N; i++) {
            //inner loop
            for (int j = 0; j < N; j++) {

                if (i == 0 || i == N-1 || j == 0 || j == N-1) {
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
