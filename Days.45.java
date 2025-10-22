package Day45;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Minuman ===");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Jus Jeruk");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Kopi. Harga: Rp10.000");
                break;
            case 2:
                System.out.println("Anda memilih Teh. Harga: Rp7.000");
                break;
            case 3:
                System.out.println("Anda memilih Jus Jeruk. Harga: Rp12.000");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
    }
}
    
    
