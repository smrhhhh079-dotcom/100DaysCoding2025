package Day14.java;
public class Main {
     public static void main(String[] args) {
        
        // Mengubah String menjadi tipe data primitif
        String sam = "29";
        int samra = Integer.parseInt(sam);
        System.out.println(samra);
        
        String saya = "19";
        byte kamu = Byte.parseByte(saya);
        System.out.println(kamu);
       
        String kakek = "2";
        long nenek = Long.parseLong(kakek);
        System.out.println(nenek);
        
        String perempuan = "31";
        short lakilaki = Short.parseShort(perempuan);
        System.out.println(lakilaki);
         
        String Paman = "1.2";
        double om = Double.parseDouble(Paman);   
        System.out.println(om);
        
        String meja = "2.3f";
        float kursi = Float.parseFloat(meja);
        System.out.println(meja);
        
        String kakak="kaka";
        char adek = kakak.charAt(0);
        System.out.println(kakak);
        
        String papa = "true";
        boolean ibu = Boolean.parseBoolean(papa);
        System.out.println(papa);
        
        //Mengubah String menjadi tipe data primitif
        //Seperti (String) ke tipe data int,byte,long,short,double,float,char,dan boolean.
       
    }
}
