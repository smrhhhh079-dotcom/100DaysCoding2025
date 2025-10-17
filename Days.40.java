package Day40;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+ - * /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka 2: ");
        double angka2 = sc.nextDouble();

        double hasil = 0;

        if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        }else if  (operator == '%') {
            hasil = angka1 % angka2;
        } else {
            System.out.println("Operator tidak valid!");
            return;
        }

        System.out.println("Hasil dari " + angka1 + " " + operator + " " + angka2 + " adalah " + hasil);
    }
}
    
    
