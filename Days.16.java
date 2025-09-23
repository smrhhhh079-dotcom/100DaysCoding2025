package Day16.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        // Operasi perkalian
        int kali = a * b;

        // Operasi pembagian
        int bagi = a / b;

        // Output hasil
        System.out.println("Hasil Perkalian = " + kali);
        System.out.println("Hasil Pembagian = " + bagi);
        
    }
}
    
