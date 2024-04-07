import javax.swing.*;
class Jaka {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Masukkan nama:");
        Manusia andi=new Manusia(n);
        System.out.println("Nama = "+andi.tampilkanNama());
        andi.makan();
}
}
