import java.util.Scanner;

public class PemilihanHariDenganIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka >=1 && angka <=5) {
            System.out.print(angka + " is Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.print(angka + " is weekend");
        } else {
            System.out.print(angka + " is Invalid number");
        }
    }
}

