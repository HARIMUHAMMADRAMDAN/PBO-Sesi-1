import java.util.Scanner;

public class MenghitungUmur {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan Tahun lahir: ");
        int tahunLahir = scanner.nextInt();

       
        System.out.print("Masukkan Tahun sekarang: ");
        int tahunSekarang = scanner.nextInt();

        
        int umur = tahunSekarang - tahunLahir;

       
        System.out.println("Umur: " + umur + " tahun");

       
        scanner.close();
    }
}
