package ArraysPractice;

import java.util.Arrays;
import java.util.HashSet;

public class ElementsIntTheRange {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3};
        int start = 2;
        int end = 5;
        System.out.println(checkElements(arr,start,end));
    }
    static boolean checkElements(int[] arr, int start, int end){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int integer : arr) {
            hashSet.add(integer);
        }
        for (int i = start; i < end; i++) {
            if (!hashSet.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
