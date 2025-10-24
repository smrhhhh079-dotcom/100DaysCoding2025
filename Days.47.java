package Day47;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Jadwal Mata Kuliah ===");
        System.out.print("Masukkan angka hari (1-7): ");
        int hari = sc.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Senin:");
                System.out.println("Dasar-Dasar Pemrograman");
                System.out.println("Arsitektur & Organisasi Komputer");
                break;
            case 2:
                System.out.println("Selasa:");
                System.out.println("Matematika Dasar");
                break;
            case 3:
                System.out.println("Rabu:");
                System.out.println("Pengantar Sistem dan Teknologi Informasi");
                break;
            case 4:
                System.out.println("Kamis:");
                System.out.println("Hari Libur");
                break;
            case 5:
                System.out.println("Jumat:");
                System.out.println("Pendidikan Kewarganegaraan");
                System.out.println("Fisika Elektronika");
                System.out.println("Wawasan Sosial Budaya dan IPTEKS");
                System.out.println("Agama Islam");
                break;
            case 6:
                System.out.println("Sabtu:");
                System.out.println("Hari Libur");
                break;
            case 7:
                System.out.println("Minggu:");
                System.out.println("Hari Libur");
                break;
            default:
                System.out.println("Angka tidak valid! Masukkan angka 1 sampai 7");
        }
        
    }
}
