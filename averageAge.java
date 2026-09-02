package array;

public class menghitungRataRataUmur {

    public static void main(String[] args) {
        int[] umur = {20, 30, 30, 50, 25, 15, 70, 50, 55, 46, 37, 78};
        double sum = 0;
        double average = 0;

        int length = umur.length;

        for (int i = 0; i < umur.length; i++) {
            sum += umur[i];

        }
        average = sum / length;
        System.out.printf("Rata-rata Umur adalah: %.2f", average);

    }
}
