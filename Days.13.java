package file3;

import java.util.Scanner;

public class main{
     public static void main (String[] args)

  //Soal 1
     //File 1 
     //package evaluasiday13;

     //File 2
     //public class main {}

     //File 3
     //public static void main (String[] args)

  //Soal 2
       // Nomor 1:Deklarasi variabel
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean bool;
        String str;
        
        // Nomor 2: Inisialisasi variabel
        b = 1;
        s = 2;
        i = 3;
        l = 10L;
        f = 144f;
        d = 40;
        c = 'S';
        bool = true;
        str = "Sam";

        // Output
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
        
        // Nomor 3: Update variabel
        b = 1;
        s = 2;
        i = 3;
        l = 10L;
        f = 144f;
        d = 40;
        c = 'A';
        bool = false;
        str = "Samra";

        // Cetak hasil update
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);

        // Deklarasi artinya hanya membuat tipe data tanpa nilai
        // Inisialisasi artinya memberi nilai awal ke variabel
        // Update artinya mengganti nilai lama dengan nilai baru

   //Soal 3
         Scanner input = new Scanner(System.in);
        
        String nama, nim, kelas, alamat;
        int umur;
        boolean status;
        double tinggi,berat;
        
        //Output 
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan Umur : ");
        umur = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Nim : ");
        nim = input.nextLine();
        
        System.out.print("Masukkan Status (true/false : ");
        status = input.nextBoolean();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = input.nextDouble();
        
        System.out.print("Masukkam Berat Badan : ");
        berat = input.nextDouble();
        input.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();
        
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
         
        
        System.out.print("===BIODATA SAYA===");
        input.nextLine();
        System.out.print("Nama         : " + nama    + "\n");
        System.out.print("Umur         : " + umur    + "Tahun\n");
        System.out.print("Nim          : " + nim     + "\n");
        System.out.print("Status       : " + status  + "\n" );
        System.out.print("Tinggi Badan : " + tinggi  + " cm\n");
        System.out.print("Berat Badan  : " + berat   + " kg\n");
        System.out.print("Kelas        : " + kelas   + "\n");
        System.out.print("Alamat       : " + alamat  + "\n");
        
          
        
    }
    
}
    
    
    
    
