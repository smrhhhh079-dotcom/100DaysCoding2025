package Day23;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input panjang dan lebar
        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = sc.nextInt();
        
        int luas = panjang * lebar;
        
        //Output
        System.out.println("Luas persegi panjang = " + luas);
    }
}
    
