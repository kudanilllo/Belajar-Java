package ifelse;

public class ppn {

    public static void main(String[] args) {
        double h = 250000;
        double j = 2;
        double t = 0;
        double tp;
        double ppn = 0.11;
        double totalSetelahPpn;
        t = h * j;
        if (t >= 500000) {
            tp = t * ppn;
            totalSetelahPpn = tp + t;
            System.out.printf("Total belanja anda setelah pajak ppn: %.0f rb ", totalSetelahPpn);
            
        } else {
            System.out.println("Total belanja anda: " + t);
        }
    }

}
