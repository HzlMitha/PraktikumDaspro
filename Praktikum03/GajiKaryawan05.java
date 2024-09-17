import java.util.Scanner;
public class GajiKaryawan05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gajiBulanan, upahPerjam, presentaseBonus, totalGajiKaryawan, pajak, gajiBonus, totalSebelumPajak, gajiBersih;
        int jumlahJamKerja;

        presentaseBonus = 0.1;
        pajak = 0.05;

        System.out.print("Masukkan jumlah jam kerja: ");
        jumlahJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerjam = sc.nextDouble();

        totalGajiKaryawan = jumlahJamKerja * upahPerjam * 25;
        System.out.println("Gaji karyawan: " + totalGajiKaryawan);

        gajiBonus = totalGajiKaryawan * presentaseBonus;
        System.out.println("Bonus: " + gajiBonus);

        totalSebelumPajak = gajiBonus + totalGajiKaryawan;
        System.out.println("Gaji sebelum pajak: " + totalSebelumPajak);

        gajiBulanan = totalSebelumPajak * pajak;
        System.out.println("Pajak: " + gajiBulanan);

        gajiBersih = totalSebelumPajak - gajiBulanan;
        System.out.println("Gaji karyawan bulanan: " + gajiBersih);

        sc.close();
    }
}
