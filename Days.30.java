package Day30;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("Hasil perbandingan:");
        System.out.println(a + " <= " + b + (a <= b));
        System.out.println(a + " >= " + b + (a >= b));
    }
}
  
    
