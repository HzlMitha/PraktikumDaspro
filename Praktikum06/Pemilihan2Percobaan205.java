package Praktikum06;
import java.util.Scanner;

public class Pemilihan2Percobaan205 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int pilihanMenu, harga, potonganQris = 1000;
      String member, jenisPembayaran;
      double total_bayar = 0, diskon;
      
      System.out.println("-------------------------");
      System.out.println("===== MENU KAFE JTI =====");
      System.out.println("-------------------------");
      System.out.println("1. Ricebowl");
      System.out.println("2. Ice Tea");
      System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
      System.out.println("--------------------------------------");
      System.out.print("Masukkan angka dari menu yang dipilih = ");
      pilihanMenu = sc.nextInt();
      sc.nextLine();
      System.out.print("Apakah mempunyai member (y/n) ? = ");
      member = sc.nextLine();
      System.out.print("Masukkan pembayaran QRIS/tunai = ");
      jenisPembayaran = sc.nextLine();
      System.out.println("--------------------------------------");

      if (member.equalsIgnoreCase("y")) {
          diskon = 0.10;
          System.out.println("Besar diskon = 10%");
          if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

          } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

          } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
                
          } else {
                 System.out.println("Masukkan pilihan menu dengan benar");
                 return;
          }
        
          total_bayar = harga - (harga * diskon);
          System.out.println("Total bayar setelah diskon = " + total_bayar);
        }


        else if (member.equals("n")) {
            diskon = 0;
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;

            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("---------------------------------------");

      
        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= potonganQris;
            System.out.println("potongan QRIS Rp 1000");
        }
        
        System.out.println("Total bayar QRIS " + total_bayar);
        sc.close();
    }
}