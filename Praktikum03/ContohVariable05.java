public class ContohVariable05{
    public static void main(String[]args){
        String Hobi = "Menyanyi";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umur = 18;
        double ipk = 3.95, tinggi = 160;
        System.out.println("Hobi: " + Hobi);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s cm", umur, tinggi));

    }
}