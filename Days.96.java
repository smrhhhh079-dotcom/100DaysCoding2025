package Day96;

public class Main {
    
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        
        

        System.out.println("Angka 1 : " + a);
        System.out.println("Angka 2 : " + b);

        System.out.println("\n==HASIL OPERASI==");
        System.out.println("Penjumlahan : " + tambah(a, b));
        System.out.println("Pengurangan : " + kurang(a, b));
        System.out.println("Perkalian   : " + kali(a, b));
        System.out.println("Pembagian   : " + bagi(a, b));

    }

    public static int tambah(int x, int y) {
        return x + y;
    }

    public static int kurang(int x, int y) {
        return x - y;
    }

    public static int kali(int x, int y) {
        return x * y;
    }

    public static int bagi(int x, int y) {
        return x / y;
    }

}
    
    
