package RecursionPractice;

import java.util.ArrayList;

public class PrintDecreaseAndIncreasePattern {
    public static void main(String[] args) {
        int n = -16;
        for (int i : printPatternDecrease(n)) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> printPatternDecrease(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        if(n<=0){
            return list;
        }
        list.addAll(printPatternDecrease(n-5));
        list.add(n);
        return list;
    }
}
