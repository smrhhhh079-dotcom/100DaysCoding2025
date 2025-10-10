package Day33;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai kamu: ");
        double nilai = input.nextDouble();
        
        boolean tidaklulus = !(nilai >=75);
        
        System.out.println("Apakah saya tidak lulus? " + tidaklulus);

    
    }
}   
