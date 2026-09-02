package forLoop;

public class multipicationTableExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("ini loop i ke:" + i); //di jalankan 3 kali
            for (int j = 1; j <= 3; j++) {
                System.out.println("loop j ke:" + j);
                System.out.println("ini hasil dari i * j:" + i * j); //di jalankan 9 kali 
            }
            System.out.println();
        }
        System.out.println("""

                Output nya:
                1 2 3
                2 4 6
                3 6 9
                """);
    }
}
