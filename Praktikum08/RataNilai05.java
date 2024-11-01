package Praktikum08;
import java.util.Scanner;

public class RataNilai05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int i, j;
        float nilaiMhs, totalNilai, rataNilai;

        //outer loop
        i=1;
        while (i<=5) {
            totalNilai=0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            //inner loop
            for (j = i; j <= 5; j++) {
                System.out.print("Nilai ke- " + j + " = ");
                nilaiMhs = sc05.nextInt();
                totalNilai+= nilaiMhs;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke " + i + " adalah " + rataNilai );
            i++;
        }
    }
}
