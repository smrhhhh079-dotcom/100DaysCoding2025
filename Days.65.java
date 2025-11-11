package Day65;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        int faktorial = 1;

        System.out.print("Proses: ");
        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" x ");
            }
        }

        System.out.println();
        System.out.println("/nHasil faktorial dari " + n + " adalah: " + faktorial);
    }
}
