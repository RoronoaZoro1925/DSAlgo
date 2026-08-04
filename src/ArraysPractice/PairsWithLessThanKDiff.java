package ArraysPractice;

public class PairsWithLessThanKDiff {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println(countPairsWithLessThanKDiff(arr, k));
    }

    private static int countPairsWithLessThanKDiff(int[] arr, int k) {
        int count = 0;
        
        // iterate through the array to find pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < k) {
                    count++;
                }
            }
        }
        return count;
    }
}
