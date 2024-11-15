package Praktikum09;
import java.util.Scanner;

public class MenyalinArray {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan elemen array: ");
        int elemen = sc05.nextInt();


        int[] arrayPertama = new int[elemen];
        
        int[] arrayKedua = new int[arrayPertama.length];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan input array " + (i+1) +" : ");
            arrayPertama[i] = sc05.nextInt();
        }

        for (int i = 0; i < elemen; i++) {
            arrayKedua[i] = arrayPertama[elemen];
        }

        System.out.println("Isi array kedua: " + arrayKedua);
        //System.out.println(arrayKedua + " ");
        
        sc05.close();
    }
}
