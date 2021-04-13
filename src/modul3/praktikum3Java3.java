package modul3;

import javax.swing.JOptionPane;

public class praktikum3Java3 {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Siapa Nama Anda? ");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Berapa umur Anda? "));
        System.out.println("Hai " + nama + ", umurmu sekarang adalah " + umur + " tahun");
    }
}
