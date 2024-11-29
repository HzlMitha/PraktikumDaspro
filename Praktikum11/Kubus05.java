package Praktikum11;
import java.util.Scanner;

public class Kubus05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int sisi, vol, luasPermukaan;
        System.out.print("Masukkan panjang sisi: ");
        sisi = sc05.nextInt();

        vol = hitungVol(sisi);
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + vol);

        luasPermukaan = hitLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);

        sc05.close();
    }

    public static int hitungVol(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }

    public static int hitLuasPermukaan(int sisi) {
        int luasPmk = 6 * sisi * sisi;
        return luasPmk;
    }
}
