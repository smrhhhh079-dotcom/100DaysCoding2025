package Day37;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int Angka = sc.nextInt();

        if (Angka < 10) {
            System.out.print("Satuan ");
        } 
        else if (Angka >= 10 && Angka < 100) {
            System.out.print("Puluhan ");
        } 
        else if (Angka >= 100 && Angka < 1000) {
            System.out.print("Ratusan ");
        } 
        else {
            System.out.print("Ribuan ");
        }

        if (Angka % 2 == 0) {
            System.out.print("dan Genap");
        } 
        else {
            System.out.print("dan Ganjil");
        }
    }
}
    
    
