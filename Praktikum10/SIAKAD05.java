package Praktikum10;
import java.util.Scanner;

public class SIAKAD05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc05.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc05.nextInt();

        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc05.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/jmlMatkul);
        }

        System.out.println("\n==================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for(int i = 0; i < jmlMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j+1) + " : " + totalPerMatkul/jmlMahasiswa);
        }

        sc05.close();
    }
}
