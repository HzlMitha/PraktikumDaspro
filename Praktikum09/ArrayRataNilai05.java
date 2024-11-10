package Praktikum09;
import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc05.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double totalTidakLulus = 0;
        double totalLulus = 0;
        double rata2TidakLulus = 0, rata2Lulus = 0;
        int jumlahTidakLulus = 0, jumlahLulus = 0, tertinggi = 0, terendah = 100;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc05.nextInt();

            if (nilaiMhs[i] < 70) {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            } else {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            }
        }

            rata2Lulus = totalLulus/jumlahLulus;
            System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        
            rata2TidakLulus = totalTidakLulus/jumlahTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);   
        

        for (int n = 0; n < nilaiMhs.length; n++) {
            if (nilaiMhs[n] > tertinggi) {
                tertinggi = nilaiMhs[n];
            }
            if (nilaiMhs[n] < terendah) {
                terendah = nilaiMhs[n];
            }
        } 
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        sc05.close();
    }

}
