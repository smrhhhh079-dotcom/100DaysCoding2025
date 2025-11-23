package Day77;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();
        
        System.out.println("Substring (0-3): " + teks.substring(0, 3));
        System.out.println("Replace 'a' dengan 'o': " + teks.replace("a", "o"));
        System.out.println("Trim (hapus spasi): '" + teks.trim() + "'");
    }
    
}
    
