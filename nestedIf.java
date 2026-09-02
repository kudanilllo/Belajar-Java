package ifelse;

public class NestedIfRealCase {

    public static void main(String[] args) {
        int age = 17;
        boolean lulusTesTeori = false;

        if (age >= 17) {
            System.out.println("umur anda sudah cukup untuk tes sim");
            if (lulusTesTeori) {
                System.out.println("anda lulus teori dan berhak mendapatkan sim");
            } else {
                System.out.println("maaf anda belum lolos teori dan tidak berhak mendapatkan sim!");
            }
        } else {
            System.out.println("Maaf umur anda belum cukup untuk membuat sim!");
        }
    }
}
