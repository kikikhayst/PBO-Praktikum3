package modul3;

import java.util.*;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 80) {
            System.out.println("Grade A");
        } else if (nilai >= 70) {
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
