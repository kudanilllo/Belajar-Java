package array;

public class kursiTeater {

    public static void main(String[] args) {
        String[] nama = {"Adit", "Agif", "Atar", "Aqil", "Budi"};
        int panjangElemen = nama.length;

        for (int i = 0; i < panjangElemen; i++) {
            System.out.println("kursi nomor: " + (i + 1) + " Sudah di isi oleh: " + nama[i]);
        }

    }
}
