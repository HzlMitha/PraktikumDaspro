package Praktikum06;
import java.util.Scanner;

public class Percobaan1TanpaLogika05 {
    
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = sc05.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        sc05.close();;
    }
}
