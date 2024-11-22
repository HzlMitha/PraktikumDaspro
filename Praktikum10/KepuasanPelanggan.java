package Praktikum10;

import java.util.Scanner;

public class KepuasanPelanggan {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        // Jumlah responden dan jumlah pertanyaan
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        // Array 2D untuk menyimpan hasil survei
        double[][] hasilSurvei = new double[jumlahResponden][jumlahPertanyaan];

        // Memasukkan data survei
        //Menghitung dan menampilkan rata-rata per responden
        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalNilai = 0;
            System.out.println("Responden " + (i+1) );

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai untuk Pertanyaan ke-" + (j+1) + ": ");
                hasilSurvei[i][j] = sc05.nextDouble();
                totalNilai += hasilSurvei [i][j];
            }
            double rataRata = totalNilai / jumlahPertanyaan;
            System.out.println("Nilai rata-rata responden " + (i+1) + ": " + rataRata);
        }
        
        // Menghitung dan menampilkan rata-rata per pertanyaan
        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalNilai = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                totalNilai += hasilSurvei[i][j];
            }
            double rataRata = totalNilai / jumlahResponden;
            System.out.println("Nilai rata-rata Pertanyaan ke-" + (j+1) + ": " + rataRata);
        }

        // Menghitung dan menampilkan rata-rata keseluruhan
        double totalNilaiKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {

            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalNilaiKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = totalNilaiKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);

        sc05.close();
    }
} 
    

