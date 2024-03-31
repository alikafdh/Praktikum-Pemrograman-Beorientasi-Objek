import javax.swing.*;
//deklarasi class
public class volumebalok {
    //deklarasi method utama
    public static void main(String[] args) {
        double volume;
        //instan objek dari class balok
        balok b1 = new balok();        
        b1.panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan Panjang Balok : "));      
        b1.lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan Lebar Balok : ")) ;      
        b1.tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukan Tinggi Balok : "));
        //hitung
        volume = b1.panjang*b1.lebar*b1.tinggi;
        System.out.println("Volume Balok = "+volume+" Cm3");
    }
}
