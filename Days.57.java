package Day57;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan lebar : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan panjang : ");
        int panjang = sc.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
    
    
