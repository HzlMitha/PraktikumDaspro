package Praktikum09;
import java.util.Scanner;

public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int i = sc05.nextInt();
    
        int[] arrNilai = new int[i]; 


        for (int b = 0; b < i; b++) {
                System.out.print("Masukkan nilai mahasiswa ke- " + (b+1) + ": ");
                arrNilai[b] = sc05.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc05.nextInt();

        int indexNilai = -1;
        for (int b = 0; b < i; b++) {

            if (arrNilai[b] == key) {
                indexNilai = b;
                break;
            } 

        } 
        
        if (indexNilai != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke- " + (indexNilai+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        

        // for (int b = 0; b < i; b++) {
        //     System.out.print("Masukkan nilai mahasiswa ke- " + (b+1) + ": ");
        //     arrNilai[b] = sc05.nextInt();
        // }

        // System.out.print("Masukkan nilai yang ingin dicari: ");
        // int key = sc05.nextInt();

        // int index = linearSearch(arrNilai, key);
        
        // if (index != -1) {
        //     System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (index+1));
        // } else {
        //     System.out.println("Nilai yang dicari tidak ditemukan");
        // }

        //int hasil = 0;

        // for (int a = 0; i < arrNilai.length; a++) {
        //     if (key == arrNilai[i]) {
        //         hasil = i;
        //         break;
        //     } else {
        //         System.out.println("Nilai yang dicari tidak ditemukan");
        //         return;
        //     }
        // }

        
        // int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        // int key = 90;
        // int hasil = 0;

        // for (int i = 0; i < arrNilai.length; i++) {
        //     if (key == arrNilai[i]) {
        //         hasil = i;
        //         break;
        //     }
        // }
        
        // System.out.println();
        // System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        // System.out.println();
        sc05.close();
    }

    // public static int linearSearch(int[] arrNilai, int key) {
    //     for (int i = 0; i < arrNilai.length; i++) {
    //         if (arrNilai[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}
