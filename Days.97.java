package Day97;

public class Main {
    
    public static void main(String[] args) {
        int sisi = 5;
        int luas = luasPersegi(sisi);

        System.out.println("Sisi : " + sisi);
        System.out.println("Luas Persegi : " + luas);
    }

    static int luasPersegi(int s) {
        return s * s;
    }
}
    
    
