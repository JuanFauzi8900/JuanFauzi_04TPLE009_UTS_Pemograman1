import java.util.Scanner;

public class Latihan_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float kehadiran, nilai;
        String grade;

        // Input
        System.out.print("Masukkan Persentase Kehadiran : ");
        kehadiran = input.nextFloat();

        System.out.print("Masukkan Nilai Total : ");
        nilai = input.nextFloat();

        // Cek kehadiran
        if (kehadiran < 75) {
            System.out.println("Tidak Lulus Karena Kehadiran Kurang Dari 75%");
        } else {

            // Penentuan grade
            if (nilai >= 80) {
                grade = "A";
            } else if (nilai >= 70) {
                grade = "B";
            } else if (nilai >= 60) {
                grade = "C";
            } else if (nilai >= 55) {
                grade = "D";
            } else {
                grade = "E";
            }

            // Output
            System.out.println("Nilai : " + nilai);
            System.out.println("Grade : " + grade);
        }

        input.close();
    }
}