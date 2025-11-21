package Day75;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks : ");
        String teks = input.nextLine();

        System.out.println("Panjang teks : " + teks.length());
        System.out.println("Uppercase (Huruf Besar) : " + teks.toUpperCase());
        System.out.println("Lowercase (Huruf Kecil) : " + teks.toLowerCase());
    }
    
}
    
    
