import java.util.Scanner;

public class MenghitungUangKembalian {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Uang Tunai: ");
    int uangtunai = scanner.nextInt();
    
    System.out.print("Masukkan Total Belanja: ");
    int totalbelanja = scanner.nextInt();

    int uangkembali = uangtunai - totalbelanja;

    System.out.println("uangkembali: " + uangkembali);

       
    scanner.close();
    
    }
    
}

