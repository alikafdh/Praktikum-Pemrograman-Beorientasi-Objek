/**
 *
 * @author alika
 */
public class balok {
    double panjang;
    double lebar;
    double tinggi;
    
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }

    public double hitungKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    
    public static void main(String args[]) {
        
        
        balok blk = new balok();
        blk.panjang = 10.0;
        blk.lebar = 10.0;
        blk.tinggi = 10.0;
        
        double volume = blk.hitungVolume();
        double luasPermukaan = blk.hitungLuasPermukaan();
        double keliling = blk.hitungKeliling();
        
        System.out.println("Volume balok: " + volume);
        System.out.println("Luas permukaan balok: " + luasPermukaan);
        System.out.println("Keliling balok: " + keliling);
    }
}
