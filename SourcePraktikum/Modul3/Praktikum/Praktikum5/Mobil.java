class Mobil{
    private String merk, type, warna;
    private double harga;
    
    public void setMerk(String merk){this.merk=merk;}
    public void setType(String type){this.type=type;}
    public void setWarna(String colour){this.warna=colour;}
    public void setHarga(double harga){this.harga=harga;}
    
    public String getMerk(){return merk;}
    public String getType(){return type;}
    public String getWarna(){return warna;}
    public double getHarga(){return harga;}
    
    public double CashBack(){
        double cashback=0.1*getHarga();
        double total=getHarga()-cashback;
        return total;
    }
    public void Keterangan(){
        System.out.println("Harga Mobil setelah dikurangi Cashback = "+CashBack());
    }
}
