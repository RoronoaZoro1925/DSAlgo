package ArraysPractice;

import java.util.Arrays;

public class SumElements {
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        System.out.println(elementSum(arr));
        System.out.println(efficientElementSum(arr));
    }

    static int elementSum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    static int efficientElementSum(int[] arr){
        int sum = Arrays.stream(arr).sum();
        return sum;
    }
}
