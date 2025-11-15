package Day69;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Soal 1
        System.out.println("====Kalkulator Sederhana====");

        while (true) {
            double a = sc.nextDouble();
            char angka = sc.next().charAt(0);
            double b = sc.nextDouble();

            double hasil = 0;

            switch (angka) {
                case '+':
                    hasil = a + b;
                    break;
                case '*':
                    hasil = a * b;
                    break;
                case '-':
                    hasil = a - b;
                    break;
                case '%':
                    hasil = a % b;
                    break;
                case '/':
                    hasil = a / b;
                    break;
                default:

                    System.out.println("operator tidak dikenal");
              
            }
            System.out.println("Hasil dari " + a + " " + angka + "  " + b + " adalah " + hasil);

        }

    }
}

            // Soal 2
        System.out.print("Masukkan jumlah karung: ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan jumlah per karung: ");
        int berat = sc.nextInt();

        int total = jumlah * berat;

           System.out.println("Total berat: " + total);

    }
}

       // Soal 5
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();
        
        String predikat = (nilai >= 90 && nilai <= 100) ? "A":
                          (nilai >= 80 && nilai <= 89) ? "B":
                          (nilai >= 70 && nilai <= 79) ? "C":
                          (nilai >= 60 && nilai <= 69) ? "D":
                          (nilai >= 0 && nilai <= 59) ? "E": "Error";
             
                System.out.println(predikat);
                }
}

      
