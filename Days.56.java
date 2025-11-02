package Day56;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
            if (angka != 0) {
                System.out.println("Anda memasukkan: " + angka);
            }
        } while (angka != 0);

        System.out.println("Program selesai.");
    }
}
    
