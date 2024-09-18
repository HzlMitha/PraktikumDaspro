import java.util.Scanner;
public class TagihanListrik05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tagihanListrik, kWh, penggunaanListrik, tarifListrik;

        tarifListrik = 1500;
        penggunaanListrik = 500;

        System.out.println("Tarif listrik: " + tarifListrik);

        
        System.out.print("Masukkan penggunaan listrik (kWh): ");
        kWh = sc.nextDouble();
        System.out.println("Apakah penggunaan listrik lebih dari 500kWh: " + (kWh >= penggunaanListrik));
        tagihanListrik = kWh * tarifListrik;
        System.out.println("tagihan listrik: " + tagihanListrik);
        
        sc.close();
    }
}
