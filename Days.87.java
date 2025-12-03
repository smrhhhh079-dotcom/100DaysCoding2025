package Day87;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] data = {10, 20, 30, 40, 50};

        System.out.print("Cari angka: ");
        int cari = in.nextInt();

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                System.out.println("Ditemukan di indeks: " + i);
                return; 
            }
        }

        System.out.println("Tidak ditemukan");
    }
}
