package Day86;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah elemen: ");
        int n = input.nextInt();

        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        
        int min = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        System.out.println("Nilai minimal = " + min);
    }
}
