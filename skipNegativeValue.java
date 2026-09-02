package array;

public class skipNegatifPrintZeroNum {

    public static void main(String[] args) {
        int number[] = {-5, 3, 5, 0, 1};
        for (int n : number) {
            if (n < 0) {
                continue;
            }
            if (n == 0) {
                System.out.println("Nol:" + 0);
            }
        }
    }
}
