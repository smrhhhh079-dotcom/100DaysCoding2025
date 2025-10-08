package Day31;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         //Operator Logika AND (&&)
        System.out.print("Masukkan nilai pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int b = input.nextInt();
        
        boolean hasil = (a > 50) && (b > 50);

        System.out.println("Apakah kedua nilai lebih dari 50? " + hasil);
    }
}

        
    

        
    
