package Day20;

public class Main {
    
    public static void main(String[] args) {
        //Mengubah tipe data primitif menjadi String
        int angka = 100;
        String strAngka = String.valueOf(angka);
        double desimal = 3.14;
        String strDesimal = String.valueOf(desimal);
        boolean status = true;
        String strStatus = String.valueOf(status);
        
        System.out.println("Integer ke String : " + strAngka);
        System.out.println("Double ke String  : " + strDesimal);
        System.out.println("Boolean ke String : " + strStatus);
    }
}
    
    
