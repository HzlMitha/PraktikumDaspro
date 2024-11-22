package Praktikum10;
import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
    
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Keluar/Exit");
            System.out.println();
            System.out.print("Pilih menu (1,2, atau 3): ");
            int pilihan = sc05.nextInt();
            sc05.nextLine();

            switch (pilihan) {
                case 1:
                    do {
                        System.out.println();
                        System.out.print("Masukkan nama (ketik 'batal' untuk menu lain): ");
                        nama = sc05.nextLine();
                        if (nama.equalsIgnoreCase("batal")){
                            System.out.println("Input data penonton selesai.");
                            break;
                            }
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc05.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc05.nextInt();
                        sc05.nextLine();

                        

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silahkan coba lagi.");
                        } else if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi sudah terisi. Silahkan pilih kursi lain, masukkan baris dan kolom kembali");
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("\nDaftar pesanan: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih");
                default: 
                System.out.println("Pilihan tidak valid");
            }       

            // System.out.print("Masukkan nama: ");
            // nama = sc05.nextLine();
            // System.out.print("Masukkan baris: ");
            // baris = sc05.nextInt();
            // System.out.print("Masukkan kolom: ");
            // kolom = sc05.nextInt();
            // sc05.nextLine();

            //penonton[baris-1][kolom-1] = nama;

            System.out.print("kembali ke menu awal? (y/n): ");
            next = sc05.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc05.close();
    }
}
