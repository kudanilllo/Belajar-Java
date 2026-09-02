package forLoop;

public class deretFibbonaci {
    public static void main(String[] args) {
        long f1 = 1;
        long f2 = 0;
        long f3 = 0;

        for(long i = 1; i<92; i++){ // Long hanya dapat menampung hingga suku ke-92 lebih dari itu akan overflow
           
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
             System.out.println("Ini suku ke-" + i + " Nilainya: " + f3);
           
        }
    }
}

