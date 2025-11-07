package Day61;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.print("Masukkan kelipatan M: ");
        int M = input.nextInt();
        
        int jumlah = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                jumlah += i;
            }
        }
        
        System.out.println("Jumlah bilangan kelipatan " + M + " dari 1 sampai " + N + " adalah: " + jumlah);
    }
}
    
    
