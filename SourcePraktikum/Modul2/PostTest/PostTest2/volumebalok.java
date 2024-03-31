import java.io.*;
//deklarasi class
public class volumebalok {
    //deklarasi method utama
    public static void main(String[] args) throws IOException {
        BufferedReader br = new
        BufferedReader (new InputStreamReader(System.in));
        double volume;
        //instan objek dari class balok
        balok b1 = new balok(); 
        System.out.println("Masukan Panjang Balok : ");
        b1.panjang = Double.parseDouble(br.readLine());
        System.out.println("Masukan Lebar Balok : ");
        b1.lebar = Double.parseDouble(br.readLine());
        System.out.println("Masukan Tinggi Balok : ");
        b1.tinggi = Double.parseDouble(br.readLine());
        
        //hitung
        volume = b1.panjang*b1.lebar*b1.tinggi;
        System.out.println("Volume Balok = "+volume+" Cm3");
    }
}
