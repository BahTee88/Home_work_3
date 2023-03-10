import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, -3.4, 5.6, -7.9, -15.5, 6.7, 4.8, -9.4, 9.6, -8.5, 10.3, -12.8, 13.2, -14.9, 15.4};
        System.out.println(Arrays.toString(numbers));

        double sum = 0;
        int number = 0;
        boolean IsTrue = false;
        for (double i : numbers) {
            if (i < 0) {
                IsTrue = true;
            } else if (i > 0 && IsTrue) {
                sum = sum + i;
                number++;
            }
        }
        System.out.println("общее среднее :" + sum / number);
        int[] value = {2, -6, 5, 8, 3, 7};
        sort(value);

    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_element = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_element])
                    min_element = j;
            int temp = array[min_element];
            array[min_element] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}



