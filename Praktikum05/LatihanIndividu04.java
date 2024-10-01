package Praktikum05;
import java.util.Scanner;

public class LatihanIndividu04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usia;

        System.out.print("Masukkan usia(angka positif): ");
        usia = sc.nextInt();

        if (usia >= 0 && usia <= 12) {
            System.out.println(usia + " tahun termasuk kategori Anak ");
        }
        else if (usia >= 13 && usia <= 19){
            System.out.println(usia + " tahun termasuk kategori Remaja ");
        }
        else if (usia >= 20 && usia <= 64){
            System.out.println(usia + " tahun termasuk kategori Dewasa ");
        }
        else if (usia >= 65){
            System.out.println(usia + " tahun termasuk kategori Lansia ");
        }
        else {
            System.out.println("usia tidak valid");
        }
        sc.close();
    }
}
