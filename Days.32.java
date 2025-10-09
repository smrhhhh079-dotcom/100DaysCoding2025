package Day32;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = input.nextInt();
        
        boolean hasil = (nilai1 >= 80) || (nilai2 >= 80);

        System.out.println("\nApakah salah satu nilainya lebih dari 80? " + hasil);
    }
}
    
