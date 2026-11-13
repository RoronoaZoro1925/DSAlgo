package ArraysPractice;

import java.util.ArrayList;

public class ValueEqualToPosition {
    public static void main(String[] args) {
        int[] arr = {7,5,3,8,9,6};
        System.out.println(valueToPosition(arr));
    }

    static ArrayList<Integer> valueToPosition(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int position = i+1;
            if (arr[i]==position) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
