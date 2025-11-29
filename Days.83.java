package Day83;

public class Main {
    
    public static void main(String[] args) {
        int[] angka = {5, 10, 15, 20, 25};

        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        System.out.println("Jumlah elemen array = " + total);
    }
    
}
