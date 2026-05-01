import java.util.Scanner;
public class Latihan1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float kehadiran, tugas, uas, uts, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        //S1 statment perintah
        System.out.print("masukan kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("masukan tugas: ");
        tugas = input.nextFloat();
        System.out.print("masukan uts: ");
        uts = input.nextFloat();
        System.out.print("masukan uas: ");
        uas = input.nextFloat();

        //P1 proses 1
        b_kehadiran = kehadiran * 0.10f;
        b_tugas = tugas * 0.20f;
        b_uts = uts * 0.30f;
        b_uas = uas * 0.40f;

        total = b_kehadiran + b_tugas + b_uts + b_uas;

        //S2 Statment Informasi
        System.out.println("-----------------------------------");
        System.out.println("Hasil Perhitungan Nilai");
        System.out.println("-----------------------------------");
        System.out.println("Nilai Kahadiran (10%): " + b_kehadiran);
        System.out.println("Nilai Tugas (20%): " + b_tugas);
        System.out.println("Nilai Uts (30%): " + b_uts);
        System.out.println("Nilai Uas (40%): " + b_uas);
        System.out.println("-----------------------------------");
        System.out.println("Total Nilai Akhir: " + total);
    }
}
