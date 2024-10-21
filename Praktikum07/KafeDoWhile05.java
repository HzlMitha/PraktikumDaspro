package Praktikum07;
import java.util.Scanner;

public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {

            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc05.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi dibatalkan.");
            break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc05.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc05.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc05.nextInt();

            double totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc05.nextInt();

        } while (true);

        System.out.println("Semua transaksi selesai.");  
        sc05.close();
    }
}
