package Day17.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a : ");
        int a = input.nextInt();
        System.out.print("Masukkan niali b : ");
        int b = input.nextInt();
        
        int hasil = a % b;
        System.out.println("Sisa bagi (a % b): " + hasil);
    }
}
