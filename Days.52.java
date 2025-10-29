package Day52;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 1;
        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        while (angka <= batas) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap");
            } else {
                System.out.println(angka + " adalah bilangan ganjil");
            }
            angka++;
        }
        
    }
}
