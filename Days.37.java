package Day37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if(angka % 2 == 0) {
            System.out.println("Angka yang Anda masukkan adalah genap");
        }else{
            System.out.println("Angka yang Anda masukkan adalah ganjil");
        }
    }
    
}
