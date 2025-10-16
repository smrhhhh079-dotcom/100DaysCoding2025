package Day39;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Daftar Kost =====");
        System.out.println("1. Kost Putra");
        System.out.println("2. Kost Putri");
        System.out.print("Masukkan pilihan: ");
        int pilihanKost = input.nextInt();

        if (pilihanKost == 1) {
            System.out.println("--- Pilihan Kost Putra ---");
            System.out.println("1. Kost Putra Ekonomi");
            System.out.println("2. Kost Putra Premium");
            System.out.print("Masukkan pilihan: ");
            int pilihanPutra = input.nextInt();

            if (pilihanPutra == 1) {
                System.out.println("===== Spesifikasi Kost =====");
                System.out.println("Jenis Kost  : Kost Putra Ekonomi");
                System.out.println("Fasilitas   : Kasur, Lemari, Kipas Angin");
                System.out.println("Harga       : Rp500.000 per bulan");
                System.out.println("Lokasi      : Dekat Perpustakaan");
            } else if (pilihanPutra == 2) {
                System.out.println("===== Spesifikasi Kost =====");
                System.out.println("Jenis Kost  : Kost Putra Premium");
                System.out.println("Fasilitas   : AC, Wifi, Kamar Mandi Dalam, Lemari, Kasur");
                System.out.println("Harga       : Rp1.000.000 per bulan");
                System.out.println("Lokasi      : Dekat kampus gedung A");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } 
        else if (pilihanKost == 2) {
            System.out.println("--- Pilihan Kost Putri ---");
            System.out.println("1. Kost Putri Reguler");
            System.out.println("2. Kost Putri Eksklusif");
            System.out.print("Masukkan pilihan: ");
            int pilihanPutri = input.nextInt();

            if (pilihanPutri == 1) {
                System.out.println("===== Spesifikasi Kost =====");
                System.out.println("Jenis Kost  : Kost Putri Reguler");
                System.out.println("Fasilitas   : Kasur, Lemari, Wifi");
                System.out.println("Harga       : Rp700.000 per bulan");
                System.out.println("Lokasi      : Dekat Kampus gedung B");
            } else if (pilihanPutri == 2) {
                System.out.println("===== Spesifikasi Kost =====");
                System.out.println("Jenis Kost  : Kost Putri Eksklusif");
                System.out.println("Fasilitas   : AC, Kamar Mandi Dalam, Meja Belajar, Wifi Cepat");
                System.out.println("Harga       : Rp1.300.000 per bulan");
                System.out.println("Lokasi      : Dekat kampus gedung FK");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        
            }else {
                System.out.println("Pilihan kost tidak tersedia.");
        }
        
    }
}
        
    

    
    
