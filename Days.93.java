package Day93;

public class Main {
    
    public static void main(String[] args) {
        double angka1 = 7.2;
        double angka2 = 7.8;
        double angka3 = 7.5;
        
        System.out.println("===CEIL===");
        tampilkanCeil(angka1);
        System.out.println("\n===FLOOR===");
        tampilkanFloor(angka2);
        System.out.println("\n===ROUND===");
        tampilkanRound(angka3);
          
        
    }
    public static void tampilkanCeil(double angka){
        double hasil = Math.ceil(angka);
        System.out.println("Ceil dari " + angka + " = " + hasil);
    }
    public static void tampilkanFloor(double angka){
        double hasil = Math.floor(angka);
        System.out.println("Floor dari " + angka + " = " + hasil);
    }
    public static void tampilkanRound(double angka){
        long hasil = Math.round(angka);
        System.out.println("Round dari " + angka + " = " + hasil);
    }
   

}
    
    
