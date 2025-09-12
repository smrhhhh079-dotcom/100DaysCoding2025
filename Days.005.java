package Day5;

public class Main {
     public static void main(String[] args) {
        byte a = 10;
        short b = 200;
        int c = 5000;
        long d = 100000L;

        System.out.println("Byte : " + a);
        System.out.println("Short: " + b);
        System.out.println("Int  : " + c);
        System.out.println("Long : " + d);
        
        //byte a = 10; → tipe data byte (8 bit), hanya bisa menyimpan nilai dari -128 sampai 127.

        //short b = 200; → tipe data short (16 bit), bisa menyimpan nilai dari -32,768 sampai 32,767.

        //int c = 5000; → tipe data int (32 bit), nilai bisa sangat besar, biasanya dipakai default untuk bilangan bulat.

        //long d = 100000L; → tipe data long (64 bit), bisa menyimpan angka yang jauh lebih besar. Perlu ditulis dengan huruf L di akhir supaya dikenali sebagai long.

    }
}
