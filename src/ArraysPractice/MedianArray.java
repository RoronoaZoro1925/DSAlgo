package ArraysPractice;

import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int[] array = {90,100,78,89,67};
        System.out.println(calculateMedianOfArray(array));
    }

    public static double calculateMedianOfArray(int[] array){
        Arrays.sort(array);
        int n = array.length;

        // 3. Apply the formula based on odd or even count
        if (n % 2 != 0) {
            // Odd length: return the middle element
            return array[n / 2];
        } else {
            // Even length: return average of two middle elements
            // Dividing by 2.0 ensures a precise double/floating-point result
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        }
    }
}