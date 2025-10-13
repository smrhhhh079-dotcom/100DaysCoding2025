package Day36;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=======SELAMAT DATANG DI TOKO SAMRA=======");
        
        System.out.println("Kami menyediakan berbagai jenis jilbab berkualitas!");
        System.out.println("Silahkan pilih merek jilbab yang ingin Anda beli:");
        System.out.println("1. Jilbab Bella");
        System.out.println("2. Jilbab Paris");
        System.out.print("Masukkan pilihan (1/2): ");
        int merk = sc.nextInt();

        if (merk == 1) {
            System.out.println("=== Pilihan Jilbab Bella ===");
            System.out.println("1. Bella Diamond Premium");
            System.out.println("2. Bella Square Polos");
            System.out.print("Masukkan pilihan jenis: ");
            int jenis = sc.nextInt();

            if (jenis == 1) {
                System.out.println("--- Detail Produk ---");
                System.out.println("Merek     : Jilbab Bella");
                System.out.println("Jenis     : Diamond Premium");
                System.out.println("Bahan     : Diamond Crepe Lembut");
                System.out.println("Harga     : Rp 35.000");
                System.out.println("Warna     : Abu Muda,Coklat Susu,Hitam");
            } else if (jenis == 2) {
                System.out.println("--- Detail Produk ---");
                System.out.println("Merek     : Jilbab Bella");
                System.out.println("Jenis     : Square Polos");
                System.out.println("Bahan     : Voal Premium");
                System.out.println("Harga     : Rp 25.000");
                System.out.println("Warna     : Maroon,Navy,DustyPink");
            } else {
                System.out.println("Jenis yang Anda pilih tidak tersedia.");
            }

        } else if (merk == 2) {
            System.out.println("=== Pilihan Jilbab Paris ===");
            System.out.println("1. Paris Polos Premium");
            System.out.println("2. Paris Motif Bunga");
            System.out.print("Masukkan pilihan jenis: ");
            int jenis = sc.nextInt();

            if (jenis == 1) {
                System.out.println("--- Detail Produk ---");
                System.out.println("Merek     : Jilbab Paris");
                System.out.println("Jenis     : Polos Premium");
                System.out.println("Bahan     : Katun Paris Lembut");
                System.out.println("Harga     : Rp 20.000");
                System.out.println("Warna     : Putih,Hitam,Mocca");
            } else if (jenis == 2) {
                System.out.println("--- Detail Produk ---");
                System.out.println("Merek     : Jilbab Paris");
                System.out.println("Jenis     : Motif Bunga");
                System.out.println("Bahan     : Katun Paris Motif");
                System.out.println("Harga     : Rp 22.000");
                System.out.println("Warna     : Pink Floral,Blue Sky,Lavender");
            } else {
                System.out.println("Jenis yang Anda pilih tidak tersedia.");
                
                System.out.println("Terima kasih telah berbelanja di Toko SAMRA!");
    }
}
}
}
          
    


