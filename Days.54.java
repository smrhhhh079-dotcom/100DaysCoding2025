package Day54;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        double nilai, totalValid = 0;
        int jumlahValid = 0, jumlahTidakValid = 0;
        double nilaiTerkecil = 100, nilaiTerbesar = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid dan tidak diproses.");
                jumlahTidakValid++;
                continue;
            }

            totalValid += nilai;
            jumlahValid++;

            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }

            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }
        }

        double rataRata = totalValid / jumlahValid;

        System.out.println("Total nilai valid          : " + totalValid);
        System.out.println("Jumlah nilai valid         : " + jumlahValid);
        System.out.println("Jumlah nilai tidak valid   : " + jumlahTidakValid);
        System.out.println("Nilai valid terkecil       : " + nilaiTerkecil);
        System.out.println("Nilai valid terbesar       : " + nilaiTerbesar);
        System.out.println("Rata-rata nilai valid      : " + rataRata);
    }
}
