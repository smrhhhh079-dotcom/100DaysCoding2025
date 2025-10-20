package Day43;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        
        if (angka < 0) {
            System.out.println("Tidak boleh memasukkan angka negatif");
        } else if (angka == 0) {
            System.out.println("Tidak boleh memasukkan angka negatif atau nol");
        } else {
            String digit = "";
            String jenis = "";
            String bagi = "";
            
            if (angka < 10) {
                digit = "angka satuan";
            } else if (angka < 100) {
                digit = "angka puluhan";
            } else if (angka < 1000) {
                digit = "angka ratusan";
            } else {
                digit = "angka lebih dari ratusan";
            }
            
            if (angka % 2 == 0) {
                jenis = "genap";
            } else {
                jenis = "ganjil";
            }
            
            if (angka % 3 == 0 && angka % 5 == 0) {
                bagi = "yang bisa di bagi 3 dan 5";
            } else if (angka % 3 == 0) {
                bagi = "yang bisa di bagi 3";
            } else if (angka % 5 == 0) {
                bagi = "yang bisa di bagi 5";
            } else {
                bagi = "yang tidak bisa di bagi 3 atau 5";
            }

            System.out.println(angka + " adalah " + digit + " " + jenis + " " + bagi);
        }
    }
}
