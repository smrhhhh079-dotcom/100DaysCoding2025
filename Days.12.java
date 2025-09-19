package Day12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan Berat Badan (kg): ");
        double berat = input.nextDouble();

        // Bagian Output data
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Kelas       : " + kelas);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Tinggi Badan: " + tinggi + " cm");
        System.out.println("Berat Badan : " + berat + " kg");
    }
}
