package Praktikum11;

public class PengunjungCafe05 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");

    }

    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        // for (int i = 0; i < namaPengunjung.length; i++) {
        //     System.out.println("- " + namaPengunjung[i]);
        // }
    }
}
