package Day59;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Angka genap: ");
        for (int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
            
        }

        System.out.println("Angka ganjil: ");
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + " ");
            
        }
    }
}

    
