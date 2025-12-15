package Day99;

public class Main {
    
    public static void main(String[] args) {
        int N = 20;

        for (int i = 2; i <= N; i++) {
            int hitung = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    hitung++;
                }
            }
            if (hitung == 2) {
                System.out.print(i + " ");
            }
        }
    }
    
}
    
    
