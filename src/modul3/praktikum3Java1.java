package modul3;

import java.util.*;

public class praktikum3Java1 {

    public static void main(String[] args) {
        // Input Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai 1 = ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai 2 = ");
        int nilai2 = input.nextInt();
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah Nilai = " + jumlah);
    }
}
