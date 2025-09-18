package Day11.java;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //Membuat objek Scanner
        Scanner sc = new Scanner(System.in);
         
        //Meminta input nama (tipe data String)
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        
        //Scanner tipe data bilangan bulat
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        
        //Menampilkan hasil Output
        System.out.println("Halo saya " + nama+ ", umur saya " + umur + " tahun.");
    

    
        
    }
    
}
