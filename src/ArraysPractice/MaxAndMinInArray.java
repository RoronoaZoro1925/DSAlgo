package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(findMaxAndMin(arr));
    }

    public static ArrayList<Integer> findMaxAndMin(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max);
        list.add(min);
        return list;
    }
}
