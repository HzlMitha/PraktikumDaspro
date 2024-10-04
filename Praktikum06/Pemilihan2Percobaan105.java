package Praktikum06;
import java.util.Scanner;

public class Pemilihan2Percobaan105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0);
                System.out.println("Tahun kabisat");
        } else 
            System.out.println("Bukan tahun Kabisat");

    }
}
