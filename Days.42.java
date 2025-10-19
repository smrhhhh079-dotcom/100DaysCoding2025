package Day42;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int GajiPerBulan = 1000000;
        int GajiLembur = 25000;

        System.out.print("Masukkan jumlah bulan kerja: ");
        int Bulan = sc.nextInt();

        System.out.print("Masukkan jumlah jam lembur: ");
        int JamLembur = sc.nextInt();

        int GajiBersih = (GajiPerBulan * Bulan) + (GajiLembur * JamLembur);

        System.out.println("Gaji Bersih = Rp" + GajiBersih);
    }
}
    
    
