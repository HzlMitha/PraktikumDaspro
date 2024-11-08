package Praktikum08;

public class SegitigaStar {
    public static void main(String[] args) {
        
        int i = 0;

        while (i < 10) {
            int j = 10;
            while (j > i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
