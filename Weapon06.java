import java.util.Scanner;

public class Weapon06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak yang akan ditembak oleh David martinez (dalam meter):");
        int jarak = input.nextInt();

        if (jarak <5) {
            System.out.print("David martinez menggunakan melee weapons");
        } else if (jarak >5 && jarak <=1000) {
            System.out.print("David martinez menggunakan ranged weapons");
        } else {
            System.out.print("Jarak tidak valid");
        }
    }
}
