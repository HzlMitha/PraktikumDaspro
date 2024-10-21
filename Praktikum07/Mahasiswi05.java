package Praktikum07;
import java.util.Scanner;

public class Mahasiswi05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        String nama, jenisKelamin;

        for (int i = 1; 1 <= 30; i++) {
            System.out.print("Masukkan nama mahasiswa " + i + ": ");
            nama = sc05.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc05.nextLine();

            if (jenisKelamin.equalsIgnoreCase("Perempuan")) {
                System.out.println("Mahasiswi " + i + ": " + nama );
            } else if (jenisKelamin.equalsIgnoreCase("Wanita")) {
                System.out.println("Mahasiswi " + i + ": " + nama );
            } else {
                break;
            }

            sc05.close();
        } 
    }










}
