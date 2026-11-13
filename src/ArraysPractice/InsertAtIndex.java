package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAtIndex {
    public static void main(String[] args) {
        int index = 2;
        int value = 90;
        List<Integer> list= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        insertAtIndex(list, index, value);
    }

    public static void insertAtIndex(List<Integer> list, int index, int value) {
        list.add(index, value);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
