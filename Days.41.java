package evaluasimentor2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //Evaluasi Mentor 2
     //Soal 1
      System.out.print("Masukkan suhu dalam celcius: ");
      double c = sc.nextDouble();
      System.out.print("Pilih konversi: ");
      System.out.print("1. Fahrenheit ");
      System.out.print("2. Kelvin ");
      System.out.print("Masukkan pilihan: ");
      int p = sc.nextInt();
      if (p == 1){
      double f = (c*9/5)+32;
      System.out.println("Hasil konversi: " + c + "°C = " + f + "F");
     }else if(p == 2){
      final double k = c + 273.15;
      System.out.println("Hasil konversi: " + c + "°C = " + k + "K");
     }

     // Soal 2
     System.out.print("Username: ");
     String username = sc.nextLine();
     System.out.print("Password: ");
     String password = sc.nextLine();
     
     if (username.equals("SAMRA") && password.equals("7")){
     System.out.println("Anda login sebagai pengguna");
    }else if(username.equals("admin") && password.equals("admin")){
     System.out.println("Anda login sebagai admin");
     }else if(username.equals("DAUD") && password.equals("123")){
     System.out.println("Perangkat Tidak di Kenal");
    }else {
       System.out.println("Akun tidak ditemukan");
    }

  }
}  
    
    
