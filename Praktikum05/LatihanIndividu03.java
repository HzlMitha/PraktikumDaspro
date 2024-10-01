package Praktikum05;
import java.util.Scanner;

public class LatihanIndividu03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisKendaraan;
        int biayaParkir, berapaJam;
        double totalBiaya;

        System.out.print("Masukkan jenis kendaraan mobil/motor: ");
        jenisKendaraan = sc.nextLine();
        System.out.print("Masukkan lama parkir/jam: ");
        berapaJam = sc.nextInt();

        biayaParkir = 0;

        switch (jenisKendaraan) {
            case "mobil":
                biayaParkir = 5000;
                break;
            case "motor":
                biayaParkir = 3000;
                break;
            default:
                System.out.println("jenis kendaraan tidak valid");
                sc.close();
                return;    
        }
        totalBiaya = biayaParkir * berapaJam;
        System.out.println("Total biaya parkir: " + jenisKendaraan + " selama " + berapaJam + " jam adalah " + totalBiaya);
        sc.close();
    }
}
