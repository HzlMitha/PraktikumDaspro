package Praktikum06;
import java.util.Scanner;

public class Bilangan3buah05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil_1, bil_2, bil_3; 

        System.out.println("Masukkan 3 bilangan berbeda");

        System.out.print("Masukkan bilangan 1 = ");
        bil_1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2 = ");
        bil_2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3 = ");
        bil_3 = sc.nextInt();

        if (bil_1 > bil_2) {
            if (bil_1 > bil_3) {
                System.out.println("bilangan terbesar adalah bil 1");
            } else {
                System.out.println("Bilangan terbesar adalah bil 3");
            }
        } else if (bil_2 > bil_3) {
                if (bil_2 > bil_3) {
                System.out.println("Bilangan terbesar adalah bilangan 2");
                } else {
                    System.out.println("Bilangan terbesar adalah bilangan 3");
                }
        } else {
                System.out.println("Masukkan bilangan yang benar");
                return;
        }
        sc.close();
    }
}
