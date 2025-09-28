package Day21;

public class Main {
    
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("sebelum ditukar");
        System.out.println("a = " + a + ",b = " + b);
        
        int c = 17;
        int d = 4;
        
        int temp = c;
        c = d;
        d = temp;
        System.out.println("sesudah ditukar");
        System.out.println("c = " + c + ", d = " + d);

    }
}
    
