package Day14.java;
public class Main {
     public static void main(String[] args) {
        
        // Mengubah String menjadi tipe data primitif
        String sam = "29";
        int samra = Integer.parseInt(sam);
        System.out.println("sam : " + samra);
        
        String saya = "19";
        byte kamu = Byte.parseByte(saya);
        System.out.println("saya : " + kamu);
       
        String kakek = "2";
        long nenek = Long.parseLong(kakek);
        System.out.println("kakek : " + nenek);
        
        String perempuan = "31";
        short lakilaki = Short.parseShort(perempuan);
        System.out.println(lakilaki);
         
        String Paman = "1.2";
        double om = Double.parseDouble(Paman);   
        System.out.println("Paman : " + om);
        
        String meja = "2.3f";
        float kursi = Float.parseFloat(meja);
        System.out.println("meja : " + kursi);
        
        String kakak="kaka";
        char adek = kakak.charAt(0);
        System.out.println("kakak : " + adek);
        
        String papa = "true";
        boolean ibu = Boolean.parseBoolean(papa);
        System.out.println("papa : " + ibu);
        
        //Mengubah String menjadi tipe data primitif
        //Seperti (String) ke tipe data int,byte,long,short,double,float,char,dan boolean.
       
    }
}
