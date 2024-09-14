import java.util.Scanner;
public class GajiKaryawan05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gajiBulanan, upahPerjam, bonus, totalGajiKaryawan, pajak, gajiBonus;
        int jumlahJamKerja;

        bonus = 0.1;
        pajak = 0.05;

        System.out.print("Masukkan jumlah jam kerja: ");
        jumlahJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerjam = sc.nextDouble();

        totalGajiKaryawan = jumlahJamKerja * upahPerjam;

        System.out.println("Gaji karyawan: " + totalGajiKaryawan);

        gajiBonus = totalGajiKaryawan * bonus;

        System.out.println("Gaji bonus: " + gajiBonus);

        gajiBulanan = gajiBonus * pajak;

        System.out.println("Gaji karyawan bulanan: " + gajiBulanan);
    }
}
