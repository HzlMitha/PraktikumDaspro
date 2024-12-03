package Praktikum11;
import java.util.Scanner;

public class TugasCafe05 {

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc05.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc05.nextInt();


        //input data penjualanan setiap minggu
        int[][] dataPenjualan = inputDataPenjualan(jumlahMenu, jumlahHari, sc05);

        //Menampilkan data penjualanan
        tampilanDataPenjualan(dataPenjualan, jumlahMenu, jumlahHari);

        //Menampilkan menu dengan penjualanan tertinggi
        cariMenuTerlaris(dataPenjualan, jumlahMenu, jumlahHari);

        //Menampilkan rata-rata penjualan untuk setiap menu
        rataRataPenjualan(dataPenjualan, jumlahMenu, jumlahHari);
        
        
    }

    //Fungsi input data penjualanan
    public static int[][] inputDataPenjualan(int jumlahMenu, int jumlahHari, Scanner sc05) {

        int[][] penjualan = new int[menu.length][hari.length];
        System.out.println("Data penjualan seluruh Menu: ");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + (menu[i]) + " ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Penjualanan pada hari " + (hari[j]) + "\t: ");
                penjualan[i][j] = sc05.nextInt();
            }
            System.out.println();
        }

        sc05.close();
        return penjualan;
    }

    //Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilanDataPenjualan(int[][] dataPenjualan, int jumlahMenu, int jumlahHari) {
        System.out.println();
        System.out.println("==== Data penjualan untuk setiap menu selama 1 minggu ====");
        for (int i = 0; i < menu.length; i++){
            System.out.println();
            System.out.println("Menu " + (menu[i] + ": "));
            for (int j = 0; j < hari.length; j++) {
                System.out.println("Hari ke-" + (j+1) + ": " + dataPenjualan[i][j]);
                
            }
        }
    }

    //Fungsi untuk menampilkan menu terlaris 
    public static void cariMenuTerlaris(int[][] dataPenjualan, int jumlahMenu, int jumlahHari) {
        
        System.out.println();
        System.out.println("==== Menu dengan Penjualan Tertinggi ====");

        int menuTerlaris = 0;
        int maxPenjualan = 0;

        //Hitung total penjualan setiap menu
        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPenjualanPerMenu = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualanPerMenu += dataPenjualan[i][j];
            }

            //Cek apakah menu saat ini memiliki penjualan lebih tinggi
            if (totalPenjualanPerMenu > maxPenjualan) {
                maxPenjualan = totalPenjualanPerMenu;
                menuTerlaris = i;
            }
        }

        System.out.println("Penjualanan pada menu ke-" + menuTerlaris + 
                            " dengan total penjualan: " + maxPenjualan);
    }

    //Menampilkan rata-rata penjualan setiap menu
    public static void rataRataPenjualan(int[][] dataPenjualan, int jumlahHari, int jumlahMenu) {
        System.out.println();
        System.out.println("==== Rata- Rata Penjualan setiap Menu ====");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualanMenu = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualanMenu += dataPenjualan[i][j];
            }

            double rataRataPerMenu = (double) totalPenjualanMenu/ jumlahHari;
            System.out.println("Rata-rata penjualan untuk menu ke-" + (i+1) + "adalah: " + rataRataPerMenu);
        }
    }
}
