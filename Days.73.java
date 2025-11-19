package Day73;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        System.out.println("Masukkan angka.Ketika angka negatif akan berhenti.");

        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();

            if (angka < 0) {
                break;
            }

            jumlah += angka;
        }

        System.out.println("Total penjumlahan: " + jumlah);
    }
}
    
    
