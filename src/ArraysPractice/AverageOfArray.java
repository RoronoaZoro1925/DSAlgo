package ArraysPractice;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 5, 8, 7};
        System.out.println(calculateAverage(arr));
    }

    static int calculateAverage(int[] arr){
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        int result = (int)Math.floor(sum/n);
        return result;
    }
}
