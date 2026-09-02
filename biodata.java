package scanner;

import java.util.Scanner;

public class dataDiriScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String nextLine
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        // int nextInt
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        // double nextDouble
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = scanner.nextDouble();

        System.out.println("\n=== DATA DIRI ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggi + " cm");
    }
}
