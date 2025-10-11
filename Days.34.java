package Day34;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = sc.nextInt();
        
        System.out.print("Masukkan nilai c: ");
        int c = sc.nextInt();
        
        a = a + (b*c);
        boolean kondisi = (a % 2 == 0 && a/b > c || (a - b <= 10);
        
        System.out.println("Nilai akhir a " + a);
        System.out.println("Hasil logika " + kondisi);
    }
    
}
