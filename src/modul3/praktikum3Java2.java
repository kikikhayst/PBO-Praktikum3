package modul3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class praktikum3Java2 {

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Nama = ");
            String nama = input.readLine();
            System.out.print("Umur = ");
            int umur = Integer.parseInt(input.readLine());
            System.out.println(nama + " saat ini berumur " + umur + " tahun");
        } catch (IOException ex) {
            System.out.println("Terjadi kesalahan saat input data");
        }
    }
}
