public class ContohOperator {
    public static void main(String[] args) {
    int x = 2;
    System.out.println("Nilai x++adalah " + x++);
    System.out.println("Setelah operasi, nilai y adalah " + x);

    int y = 7;
    System.out.println("Nilai y++ adalah " + ++y);
    System.out.println("Setelah operasi, nilai y adalah " + y);

    int z = 12;
    System.out.println(x < z);
    System.out.println(y == x);
    System.out.println(y <= x);
    System.out.println(y <= x && x < z || y == x);

    int i = z ^ x;
    System.out.println("Nilai i adalah " + i);
     
    i %= 4;
    System.out.println("Nilai i yang baru adalah " + i);
    }
}
