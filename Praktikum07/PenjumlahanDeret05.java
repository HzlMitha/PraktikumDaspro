package Praktikum07;

public class PenjumlahanDeret05 {

    public static void main(String[] args) {
        int jumlah = 0;

        for (int i = 25; i >= 1; i--) {
            jumlah += i;
        }

        System.out.println("Hasil penjumlahan: " + jumlah);
        
    }
}