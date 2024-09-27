import java.util.Scanner;

public class Siakad06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir >80 && nilaiAkhir <=100) {
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi: Sangat baik");
        } else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            System.out.println("Nilai akhir huruf: B+");
            System.out.println("Kualifikasi: Lebih dari Baik");
        } else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi: Baik");
        } else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi: Lebih dari Cukup");
        } else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kualifikasi: Cukup");
        } else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi: Kurang");
        } else if (nilaiAkhir <39) {
            System.out.println("Nilai akhir huruf: E");
            System.out.println("Kualifikasi: Gagal");
        }
    }
}
