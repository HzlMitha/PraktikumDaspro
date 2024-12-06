package Praktikum12;
    import java.util.Scanner;

public class Investasi {
    public static double hitungInvestasiRekursif(double modal, double persenKeuntungan, int tahun) {
        if (tahun == 0) {
            return modal; 
        } else {
        return hitungInvestasiRekursif(modal * (1 + persenKeuntungan / 100), persenKeuntungan, tahun - 1);
        }
    }

    public static double hitungInvestasiIteratif(double modal, double persenKeuntungan, int tahun) {
        double total = modal;
        for (int i = 1; i <= tahun; i++) {
            total *= (1 + persenKeuntungan / 100); 
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan modal awal investasi (Rp): ");
        double modal = sc.nextDouble();
        System.out.print("Masukkan jumlah tahun investasi: ");
        int tahun = sc.nextInt();
        final double persenKeuntungan = 11.7; 

        if (modal <= 0 || tahun < 0) {
            System.out.println("Modal harus lebih dari 0 dan tahun tidak boleh negatif.");
        }

        double hasilIteratif = hitungInvestasiIteratif(modal, persenKeuntungan, tahun);
        System.out.printf("Hasil investasi setelah %d tahun (Iteratif): Rp%.2f%n", tahun, hasilIteratif);

        double hasilRekursif = hitungInvestasiRekursif(modal, persenKeuntungan, tahun);
        System.out.printf("Hasil investasi setelah %d tahun (Rekursif): Rp%.2f%n", tahun, hasilRekursif);

        sc.close();
    }
}

