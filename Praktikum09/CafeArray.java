package Praktikum09;

import java.util.Scanner;

public class CafeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        double[] daftarHarga = { 20000, 22000, 15000, 17000, 13000, 18000, 20000 };

        System.out.println("=-=-=-=-SELAMAT DATANG=-=-=-=-");
        System.out.print("Masukkan Jumlah Menu Yang Akan Dipesanan" + " : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String namaPesanan[] = new String[jumlahPesanan];
        double hargaPesanan[] = new double[jumlahPesanan];
        int jumlahItemPesanan[] = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan menu : ");
            String pilihanMenu = sc.nextLine();

            int indexMenu = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(pilihanMenu)) {
                    indexMenu = j;
                    break;
                }

            }
            if (indexMenu != -1) {
                System.out.print("Masukkan jumlah pesanan untuk " + pilihanMenu + " : ");
                int jumlah = sc.nextInt();
                sc.nextLine();

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
        for (int i = 0; i < jumlahPesanan; i++) {
            if (namaPesanan[i] != null) {
                double subtotal = hargaPesanan[i] * jumlahItemPesanan[i];
                totalHarga += subtotal;
                System.out.println(namaPesanan[i] + " x" + jumlahItemPesanan[i] + " = Rp " + subtotal);
            }
        }
        
        System.out.println("Total harga yang perlu dibayar: Rp " + totalHarga);

        sc.close();
    }
}

