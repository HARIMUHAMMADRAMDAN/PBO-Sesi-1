import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celcius: ");
        double suhuCelcius = scanner.nextDouble();
        
        double suhuReamur = (4.0 / 5.0) * suhuCelcius;
        double suhuFahrenheit = (9.0 / 5.0) * suhuCelcius + 32;
        double suhuKelvin = suhuCelcius + 273.15;
        
        System.out.println("Suhu dalam Reamur: " + suhuReamur);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);
        
        scanner.close();
    }
}
