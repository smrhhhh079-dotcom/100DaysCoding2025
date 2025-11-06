package Day60;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nilai N: ");
        int n = input.nextInt();
        
        String ganjil = "";
        String genap = "";
        
        for (int i = n; i>=1; i--){
            if (i%2==1){
                ganjil += i + " ";
            } else {
                genap += i + " ";
            }
        }
        
        System.out.println("\nAngka ganjil dari N-1: \n" + ganjil);
        System.out.println("\nAngka genap dari N-1: \n" +genap);
    }
    
}
    
    
