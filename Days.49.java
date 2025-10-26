package Day49;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nilai kamu: ");
        int nilai = sc.nextInt();

        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + hasil);
    }
}
