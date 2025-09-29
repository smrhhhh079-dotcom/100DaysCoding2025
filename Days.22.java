package Day22;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Meminta input sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();
        
        //Hitung luas
        int luas = sisi * sisi;
        
        System.out.println("Luas persegi adalah: " + luas);
    }
}
