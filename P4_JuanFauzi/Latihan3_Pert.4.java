import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float sebelum_diskon, diskon, setelah_diskon;

        System.out.print("Masukan Biaya Makan: ");
        makan = input.nextFloat();
        System.out.print("Masukan Biaya Transport: ");
        transport = input.nextFloat();
        System.out.print("Masukan Biaya Belanja: ");
        belanja = input.nextFloat();

        total = makan + transport + belanja;

        //pengeluaran sebelum diskon
        sebelum_diskon = total;

        //diskon yang didapatkan
        diskon = (total / 100) * 10;

        //pengeluaran setelah diskon
        setelah_diskon = sebelum_diskon - diskon;

        System.out.println("\n-----Laporan Pengeluaran-----");
        System.out.println("Total Pengeluaran: " + total);
        System.out.println("--------------------------------");
        System.out.println("Sebelum Diskon: " + sebelum_diskon);
        System.out.println("Diskon: " + diskon);
        System.out.println("Setelah Diskon: " + setelah_diskon);
        System.out.println("--------------------------------");

    }
}
