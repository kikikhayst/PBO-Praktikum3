package modul3;

import java.util.*;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        for (int a = 1; a <= angka; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
