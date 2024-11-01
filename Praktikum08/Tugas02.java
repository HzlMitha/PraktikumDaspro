package Praktikum08;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);


        System.out.println("Cabang olahraga pada Porseni tahun 2024");
        System.out.println("1. badminton");
        System.out.println("2. tenis meja");
        System.out.println("3. basket");
        System.out.println("4. bola voly");

        do {

            System.out.print("Masukkan cabang olahraga (ketik 'batal' untuk keluar): ");
            String cabor = sc05.nextLine();
            System.out.println("Input nama atlet dari cabang olahraga " + cabor);
            // jika telah selesai
            if (cabor.equalsIgnoreCase("batal")) {
                System.out.println("Pendaftaran selesai.");
                break;
            }

            String namaAtlet = "";
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama Atlet ke- " + j + " = ");
                namaAtlet += sc05.nextLine() + " ";
            }

            System.out.println(namaAtlet);
        } while (true);

        sc05.close();
    }
}
