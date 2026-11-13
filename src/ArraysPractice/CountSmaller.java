package ArraysPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountSmaller {
    public static void main(String[] args) {
        List<Integer> arr = List.of(10, 1, 2, 8, 4, 5);
        System.out.println(countSmallerElements(7,arr));
    }

    static int countSmallerElements(int x, List<Integer> arr){
        int count = (int) arr.stream()
        .filter(number -> number<=x)
        .count();
        return count;
    }
}
