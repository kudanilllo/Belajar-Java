package array;

public class maxMinValue {

    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 60, 56, 44, 12, 50, 90};

        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (max < n) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Max: " + min);

    }

}
