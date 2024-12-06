package Praktikum12;
import java.util.Scanner;

public class Tugas05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
        int jumlah = sc05.nextInt();
        tampilkanPolaFibonacci(jumlah);
        tampilkanPolaFibonacciIterasi(jumlah);
    }   

    public static int polaFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return polaFibonacci(n - 1) + polaFibonacci(n - 2);
        }
    }

    public static void tampilkanPolaFibonacci(int n) {
        System.out.println("Deret Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(polaFibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void tampilkanPolaFibonacciIterasi(int n) {
        int a = 1, b = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
