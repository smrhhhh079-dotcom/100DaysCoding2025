package Day51;
import java.util.Scanner;
        
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah Genap");
            } else {
                System.out.println(i + " adalah Ganjil");
            }
        }
    }
}
