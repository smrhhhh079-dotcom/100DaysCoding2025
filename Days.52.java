package Day52;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Bakso");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Kamu memilih Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Kamu memilih Mie Ayam");
        } else if (pilihan == 3) {
            System.out.println("Kamu memilih Sate Ayam");
        } else if (pilihan == 4) {
            System.out.println("Kamu memilih Bakso");
        } else if (pilihan == 5) {
            System.out.println("Terima kasih, program selesai.");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }
}
