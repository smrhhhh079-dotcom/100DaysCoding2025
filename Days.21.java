package Day21;

public class Main {
    
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println("sebelum ditukar");
        System.out.println("a = " + a + ",b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("sesudah ditukar");
        System.out.println("a = " + a + ", b = " + b);

    }
}
    
