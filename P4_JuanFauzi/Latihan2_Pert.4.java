import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float p_makan, p_transport, p_belanja;

        System.out.print("Masukan Biaya Makan: ");
        makan = input.nextFloat();
        System.out.print("Masukan Biaya Transport: ");
        transport = input.nextFloat();
        System.out.print("Masukan Biaya Belanja: ");
        belanja = input.nextFloat();

        total = makan + transport + belanja;

        p_makan = (makan / total) * 100;
        p_transport = (transport / total) * 100;
        p_belanja = (belanja / total) * 100;

        System.out.println("\n---Laporan Pengeluaran---");
        System.out.println("Total Pengeluaran: " + total);
        System.out.println("Persentase makan: " + p_makan + "%");
        System.out.println("Persentase transport: " + p_transport + "%");
        System.out.println("Persentase belanja: " + p_belanja + "%");
    }
}
