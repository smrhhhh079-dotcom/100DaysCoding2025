package Day33;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        boolean bukanDewasa = !(umur >= 18);

        System.out.println("Apakah saya belum dewasa? " + bukanDewasa);
        
    }
}
