package ArraysPractice;

import java.util.Arrays;

public class TripletsWithSumRange {

    public static void main(String[] args) {
        int[] numericArray = {8,3,5,2};
        int lowestLimit = 7;
        int maximumLimit = 11;
        System.out.println(findTriplet(numericArray,lowestLimit,maximumLimit));
    }

    private static int findTriplet(int[] numericArray, int lowestLimit, int maximumLimit) {
        Arrays.sort(numericArray);
        int count = 0;
        int sum = 0;
        for (int i =numericArray[0];i<=numericArray.length;i++)
        {
            for(int j = i;j<numericArray[i+2];j++){
                sum +=j;
                if (sum>lowestLimit&&sum<maximumLimit) {
                    count++;
                }
            }
        }
        return count;
    }
}