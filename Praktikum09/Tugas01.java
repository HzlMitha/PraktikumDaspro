package Praktikum09;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        String[] daftarMenu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        
        System.out.println("--------------------------");
        System.out.println("====== DAFTAR MENU =======");
        System.out.println("--------------------------");
        System.out.println("1.Nasi goreng     Rp 20000");
        System.out.println("2.Mie goreng      Rp 22000");
        System.out.println("3.Roti bakar      Rp 15000");
        System.out.println("4.Kentang goreng  Rp 17000");
        System.out.println("5.Teh tarik       Rp 13000");
        System.out.println("6.Cappucino       Rp 18000");
        System.out.println("7.Chocolate ice   Rp 20000");

        System.out.println();
        System.out.print("Masukkan jumlah menu yang akan dipesan: ");
        int jumlahMenu = sc05.nextInt();
        sc05.nextLine();

        String[] namaPesanan = new String[jumlahMenu];
        double[] hargaPesanan = new double[jumlahMenu];
        int[] jumlahItemPesanan = new int[jumlahMenu];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan menu " + (i+1) + " : ");
            String pilihanMenu = sc05.nextLine();

            int indexMenu = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (pilihanMenu.equalsIgnoreCase(daftarMenu[j])) {
                    indexMenu = j;
                    break;
                }
            } if (indexMenu != -1) {
                System.out.println();
                System.out.print("Masukkan jumlah pesanan untuk " + pilihanMenu + " : ");
                int jumlah = sc05.nextInt();
                sc05.nextLine();

                namaPesanan[i] = daftarMenu[indexMenu];
                hargaPesanan[i] = daftarHarga[indexMenu];
                jumlahItemPesanan[i] = jumlah;

                System.out.println("Pesanan ditambahkan: " + pilihanMenu + " x" + jumlah);
            } else {
                System.out.println("Menu tidak tersedia, silakan pilih menu lain.");
                i--;
            }

        }

        double totalHarga = 0;
        System.out.println();
        System.out.println("=======Daftar Pesanan Anda=======");

        for (int i = 0; i < jumlahMenu; i++) {
            if (namaPesanan[i] != null) {
                double subtotal = hargaPesanan[i] * jumlahItemPesanan[i];
                totalHarga += subtotal;
                System.out.println(namaPesanan[i] + " x" + jumlahItemPesanan[i] + " = Rp " + subtotal);
            }
        }
        
        System.out.println("Total harga yang perlu dibayar: Rp " + totalHarga);
        
        sc05.close();
    }

    
}
