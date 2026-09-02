package scanner;

import java.util.Scanner;

public class menentukanWaktutempuh {

    public static void main(String[] args) {
        System.out.print("Masukkan jarak: ");
        Scanner scanner = new Scanner(System.in);
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan: ");
        double kecepatan = scanner.nextDouble();

        double waktuJam = jarak / kecepatan;
        System.out.println("Waktu yang di butuhkan untuk menempuh " + jarak + " Dengan kecepatan: " + kecepatan + "kmj" + "Adalah: " + waktuJam * 60 + "menit");
    }
}
