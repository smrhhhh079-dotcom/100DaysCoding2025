package Day42;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama Pegawai : ");
        String nama = sc.nextLine();
        
        System.out.println("====Pekerjaan ====");
        System.out.println("1. PNS");
        System.out.println("2. Freelancer");
        System.out.println("===========================");
        System.out.print("Pilih Pekerjaan : ");
        int pilih = sc.nextInt();

        
        System.out.print("Penghasilan : ");
        double penghasilan = sc.nextDouble();

        String pekerjaan = "";
        double pajak = 0;
        
        if (pilih == 1) {
            pekerjaan = "PNS";
            if (penghasilan >= 5000000) {
                pajak = 0.15;
            } else if (penghasilan >= 3000000) {
                pajak = 0.10;
            } else {
                pajak = 0.0;
            }
        } else if (pilih == 2) {
            pekerjaan = "Freelancer";
            if (penghasilan >= 5000000) {
                pajak = 0.08;
            } else if (penghasilan >= 3000000) {
                pajak = 0.03;
            } else {
                pajak = 0.0;
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        
        double potongan = penghasilan * pajak;
        double bersih = penghasilan - potongan;
        
        System.out.println("============================");
        System.out.println("Nama Pegawai     : " + nama);
        System.out.println("Jenis Pekerjaan  : " + pekerjaan);
        System.out.println("Penghasilan Kotor: Rp" + penghasilan);
        System.out.println("Pajak Dikenakan  : " + (pajak * 100) + "%");
        System.out.println("Potongan         : Rp" + potongan);
        System.out.println("Penghasilan Bersih: Rp" + bersih);
    }
}
    

    
    
