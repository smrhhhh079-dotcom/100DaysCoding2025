package Day78;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat yang mengandung nama Samra: ");
        String kalimat = input.nextLine();

        System.out.print("Masukkan kata yang ingin dicari: ");
        String cari = input.nextLine();

        System.out.println("\n=== Hasil Manipulasi String ===");

        // length
        System.out.println("Jumlah Karakter (length): " + kalimat.length());

        // toUpperCase
        System.out.println("UpperCase: " + kalimat.toUpperCase());

        // toLowerCase
        System.out.println("LowerCase: " + kalimat.toLowerCase());

        // substring
        if (kalimat.length() >= 5) {
            System.out.println("Substring(0-5): " + kalimat.substring(0, 5));
        } else {
            System.out.println("Substring: Kalimat terlalu pendek");
        }

        // replace (diganti lain lagi)
        System.out.println("Replace 'a' → '#': " + kalimat.replace("a", "#"));

        // trim
        System.out.println("Trim: " + kalimat.trim());

        // contains
        System.out.println("Mengandung '" + cari + "'? : " + kalimat.contains(cari));

        // equalsIgnoreCase
        System.out.println("Equals IgnoreCase dengan 'samra'? : " + kalimat.equalsIgnoreCase("samra"));

        // isEmpty
        System.out.println("isEmpty: " + kalimat.isEmpty());
    }
}
