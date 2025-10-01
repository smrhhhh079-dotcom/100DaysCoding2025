package Day24;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
        
        //Luas lingkaran
        double luas = Math.PI * r * r;

        //Output
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah : %.2f" ,r ,Luas);
    }
}
