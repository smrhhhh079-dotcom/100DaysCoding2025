package Day21;
public class Main {
    public static void main(String[] args) {
        //Program untuk menukar nilai dua variabel
        //Menukar nilai variabel tanpa variabel sementara
        int a = 20;
        int b = 10;
        
        //Tukar nilai (Pakai operasi aritmatika)
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("sebelum ditukar");
        System.out.println("a = " + a + ",b = " + b);
        
        //Menukar nilai dengan variabel sementara
        int c = 17;
        int d = 4;
        
        int temp = c;
        c = d;
        d = temp;
        System.out.println("sesudah ditukar");
        System.out.println("c = " + c + ", d = " + d);

    }
}
    
