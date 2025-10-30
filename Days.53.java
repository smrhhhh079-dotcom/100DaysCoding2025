package Day53;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();

            if (angka < 0) {
                System.out.println("Angka negatif terdeteksi, program berhenti!");
                break;
            }

            if (angka % 2 == 0)
                System.out.println(angka + " adalah bilangan genap.");
            else
                System.out.println(angka + " adalah bilangan ganjil.");
        }
    }
}
    
    
