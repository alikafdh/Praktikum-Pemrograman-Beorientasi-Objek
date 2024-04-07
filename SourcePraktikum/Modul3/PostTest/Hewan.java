public class Hewan {
    public String jenis;
    public Hewan(String n){
        this.jenis = n;
    }
    public String tampilkanJenis(){
        return jenis;
    }
    public void suara(){
        System.out.println("meow..meow...meow...");
    }
    public void berjalan(){
        System.out.println("berjalan dengan 4 kaki");
    }
}
