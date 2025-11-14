package Day68;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {       
            for (int j = 1; j <= n; j++) {     
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    
    
