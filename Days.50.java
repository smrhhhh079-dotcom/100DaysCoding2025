package Day50;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
