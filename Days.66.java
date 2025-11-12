package Day66;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Membuat Pola Vertikal
        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt(); 
        
        for (int i = 1; i <= n; i++) {
            System.out.println("|");
        }
    }
}
