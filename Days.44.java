package Day44;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        double nilai = sc.nextDouble();
         
        System.out.println("===============NILAI ANDA ===============");
        if (nilai < 0) {
            System.out.println("Tidak boleh memasukkan angka negatif.");
        } else if (nilai > 100) {
            System.out.println("Nilai tidak boleh lebih dari 100.");
        } else {
            char predikat;
            String keterangan;

            if (nilai >= 80 && nilai <= 100) {
                predikat = 'A';
                keterangan = "Pertahankan prestasi Anda!";
            } else if (nilai >= 70 && nilai <= 79) {
                predikat = 'B';
                keterangan = "Terus tingkatkan lagi!";
            } else if (nilai >= 60 && nilai <= 69) {
                predikat = 'C';
                keterangan = "Belajar lebih giat lagi!";
            } else if (nilai >= 50 && nilai <= 59) {
                predikat = 'D';
                keterangan = "Giatkan lagi belajarnya!";
            } else {
                predikat = 'E';
                keterangan = "Jangan menyerah,tetap semangat belajar!";
            }

            System.out.println("Nilai: " + nilai);
            System.out.println("Predikat: " + predikat);
            System.out.println("Keterangan: " + keterangan);
        }
        
    }
}
    
    
    
