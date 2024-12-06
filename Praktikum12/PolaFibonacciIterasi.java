package Praktikum12;
import java.util.Scanner;

public class PolaFibonacciIterasi {
    
    public static void tampilkanPolaFibonacci(int n) {
        int a = 1, b = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
        int jumlah = sc05.nextInt();
        tampilkanPolaFibonacci(jumlah);
        
    }
}
