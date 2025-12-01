package Day85;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        
        int maksimal = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] > maksimal) {
                maksimal = data[i];
            }
        }

        System.out.println("Angka maksimal dalam array adalah: " + maksimal);
    }
}
