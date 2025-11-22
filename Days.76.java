package Day76;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks pertama : ");
        String teks1 = input.nextLine();

        System.out.print("Masukkan teks kedua   : ");
        String teks2 = input.nextLine();

        
        if (teks1.isEmpty()) {
            System.out.println("Teks pertama KOSONG");
        } else {
            System.out.println("Teks pertama TIDAK kosong");
        }
        
        if (teks1.equals(teks2)) {
            System.out.println("Kedua teks SAMA (equals)");
        } else {
            System.out.println("Kedua teks BERBEDA (equals)");
        }
        
        if (teks1.equalsIgnoreCase(teks2)) {
            System.out.println("Kedua teks sama TANPA memperhatikan huruf besar-kecil (equalsIgnoreCase)");
        } else {
            System.out.println("Kedua teks berbeda (equalsIgnoreCase)");
        }
        
        if (teks1.contains(teks2)) {
            System.out.println("Teks pertama MENGANDUNG teks kedua (contains)");
        } else {
            System.out.println("Teks pertama TIDAK mengandung teks kedua (contains)");
        }
    }
}
    
    
