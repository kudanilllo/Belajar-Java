package ifelse;

public class diskonMember {

    public static void main(String[] args) {
        int buku = 6;
        double hargaBuku = 85000;
        boolean member = true;
        double subTotal;
        double diskonUtama = 0.10;
        double diskonMember = 0.05;
        double hasilDiskUtama;
        double hasilDiskMem;
        subTotal = buku * hargaBuku;
        System.out.printf("SUBTOTAL: %.0f rb \n", subTotal);

        if (subTotal >= 400000) {  //kondisi pertama
            hasilDiskUtama = subTotal * diskonUtama;
            System.out.printf("NILAI DISKON UTAMA: %.0f rb \n", hasilDiskUtama);
            subTotal = subTotal - hasilDiskUtama;
            System.out.printf("HASIL SETELAH DISKON UTAMA: %.0f rb \n", subTotal);
        }
        if (member) { // kondisi kedua
            hasilDiskMem = subTotal * diskonMember;
            System.out.printf("NILAI DISKON MEMBER: %.0f rb \n", hasilDiskMem);
            subTotal = subTotal - hasilDiskMem;
            System.out.printf("HASIL SETELAH DISKON UTAMA & MEMBER: %.0f rb\n", subTotal);
            System.out.printf("TOTAL PEMBAYARAN AKHIR: %.0f rb \n", subTotal);
        } else {
            System.out.println("SUBTOTAL: " + subTotal);
        }

    }
}
