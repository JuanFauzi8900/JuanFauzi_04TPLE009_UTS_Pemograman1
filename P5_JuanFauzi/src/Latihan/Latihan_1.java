package Latihan;

import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {

        Scanner simpan = new Scanner(System.in);

        int pilihan;
        String makanan = "";

        System.out.print("Input pilihan: ");
        pilihan = simpan.nextInt();

        if (pilihan == 1) {
            makanan = "Ayam Goreng";
        } else if (pilihan == 2) {
            makanan = "Mie Goreng";
        } else {
            makanan = "Tidak ada pilihan";
        }

        System.out.println("Makanan: " + makanan);
    }
}