package Praktikum11;
import java.util.Scanner;

public class Kafe05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        Menu("Andi", true, "DISKON50");
        int totalAkhir = 0;

        System.out.println("berapa banyak jenis yang Anda mau pesan? ");
        int banyakJenisPesanan = sc05.nextInt();

        for (int i = 0; i < banyakJenisPesanan; i++) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc05.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc05.nextInt();
            sc05.nextLine();
            System.out.print("Masukkan kode promo (bila ada): ");
            String promo = sc05.nextLine();

            totalAkhir += hitungTotalHarga(pilihanMenu, banyakItem, promo);
        }
       
        System.out.println("Total keseluruhan Rp " + totalAkhir);
        
        // int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        // System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);

        sc05.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, String promo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (promo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapat diskon 50%");
        } else if (promo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapat diskon 30%");
        } else {
            System.out.println("kode invalid!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String promo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (promo.equalsIgnoreCase("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal * 50/100);
            System.out.println("Anda mendapatkan diskon 50%");
        } else if (promo.equalsIgnoreCase("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30/100);
            System.out.println("Anda mendapat diskon 30%");
        } else {
            System.out.println("kode invalid!");
        }
        return hargaTotal;
    }
}
