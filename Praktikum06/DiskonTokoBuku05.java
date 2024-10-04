package Praktikum06;
import java.util.Scanner;

public class DiskonTokoBuku05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        String hari, jenisBuku;
        int jumlahBuku;
        double diskon;

        System.out.print("Masukkan hari: ");
        hari = sc05.nextLine();

        System.out.print("Masukkan jenis buku (kamus/novel): ");
        jenisBuku = sc05.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc05.nextInt();

        if (hari.equalsIgnoreCase("Rabu")) {
            if (jenisBuku.equals("kamus")){
                diskon = 0.1;
                System.out.println("Anda mendapatkan total diskon " + diskon);
            
            } else if (jumlahBuku > 2) {
                diskon = 0.12;
                System.out.println("Anda mendapatkan total diskon " + diskon);
            } else {
                diskon = 0.1;
                System.out.println("Anda mendapatkan total diskon " + diskon);
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.7;
            if (jumlahBuku > 3) {
                diskon = 0.9;
                System.out.println("Anda mendapatkan total diskon " + diskon);
            } else {
                diskon = 0.6;
                System.out.println("Anda mendapatkan total diskon " + diskon);
            }
        } else if (jumlahBuku > 3) {
            diskon = 0.5;
            System.out.println("Anda mendapatkan total diskon " + diskon);

        } else {
            System.out.println("Anda tidak mendapatkan diskon");
            return;
        }
        
        sc05.close();
    }
}
