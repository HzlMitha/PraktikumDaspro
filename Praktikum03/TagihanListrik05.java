import java.util.Scanner;
public class TagihanListrik05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tagihanListrik, kWh, penggunaanListrik, tarifListrik, listrikLebih;

        tarifListrik = 1500;
        penggunaanListrik = 500;

        System.out.println("Tarif listrik: " + tarifListrik);

        
        System.out.print("Masukkan penggunaan listrik x: ");
        kWh = sc.nextDouble();
        System.out.println(kWh >= penggunaanListrik);
        tagihanListrik = kWh * tarifListrik;
        System.out.println("tagihanListrik: " + tagihanListrik);

    }
}
