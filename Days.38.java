package Day38;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan yang Anda masukkan adalah positif");
        } else if (angka < 0) {
            System.out.println("Bilangan yang Anda masukkan adalah negatif");
        } else {
            System.out.println("Bilangan yang Anda masukkan adalah nol");
        }
    }
}
    
    
