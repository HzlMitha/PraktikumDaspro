package Praktikum06;
import java.util.Scanner;

public class DiskonTokoBuku05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        String hari, jenisBuku;
        int jumlahBuku;
        double diskon, totalDiskon;

        System.out.print("Masukkan hari: ");
        hari = sc05.nextLine();

        System.out.println("-------------------------");
        System.out.println("===== TOKO BUKU =====");
        System.out.println("-------------------------");
        System.out.println("1. kamus");
        System.out.println("2. novel");
        System.out.println("3. lainnya");
        System.out.println("--------------------------------------");

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc05.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc05.nextInt();

        diskon = 0.0;
        if (hari.equalsIgnoreCase("Rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")){
                diskon = 0.1;
                if (jumlahBuku > 2) {
                    diskon += 0.02;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07;
                if (jumlahBuku > 3) {
                    diskon += 0.02;
                } else {
                    diskon += 0.01;
                }
            } else if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
            sc05.close();
            return;
            
        }
        totalDiskon = diskon * 100;
        System.out.println("Anda mendapatkan total diskon " + String.format("%.2f", totalDiskon)   
        + " % ");
        sc05.close();
    }
}
