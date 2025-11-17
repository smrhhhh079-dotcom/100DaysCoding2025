package Day71;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {        // Perulangan baris
            for (int j = 1; j <= i; j++) {    // Perulangan kolom (bintang)
                System.out.print("*");
            }
            System.out.println();             // Pindah baris
        }
    }
}
    
    
