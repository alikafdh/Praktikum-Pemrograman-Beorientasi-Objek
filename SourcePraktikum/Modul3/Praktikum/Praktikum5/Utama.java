import java.io.*;
class Utama {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Mobil mb=new Mobil();
        
        System.out.print("Masukan Merk Mobil = ");
        String merk_mobil = br.readLine();
        System.out.print("Masukan Type Mobil = ");
        String type_mobil = br.readLine();
        System.out.print("Masukan Warna Mobil = ");
        String warna_mobil = br.readLine();
        System.out.print("Masukan Harga Mobil = ");
        double harga_mobil = Double.parseDouble(br.readLine());
        mb.setMerk(merk_mobil);
        mb.setType(type_mobil);
        mb.setWarna(warna_mobil);
        mb.setHarga(harga_mobil);
        
        System.out.println("Daftar Harga, Merk, Type dan Harga Mobil");
        System.out.println("Merk Mobil="+mb.getMerk());
        System.out.println("Type Mobil="+mb.getType());
        System.out.println("Warna Mobil="+mb.getWarna());
        System.out.println("Harga Mobil Sebelum, Di Diskon="+mb.getHarga());
        mb.Keterangan();
    }
}
