package Day74;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("===== MENU MAKANAN =====");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Ayam Geprek");
            System.out.println("4. Bakso");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Anda memilih: Nasi Goreng");
                    break;
                case 2:
                    System.out.println("Anda memilih: Mie Goreng");
                    break;
                case 3:
                    System.out.println("Anda memilih: Ayam Geprek");
                    break;
                case 4:
                    System.out.println("Anda memilih: Bakso");
                    break;
                case 5:
                    System.out.println("Terima kasih! Keluar dari menu");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();

        } while (pilih != 5);
    }
}
    
    
