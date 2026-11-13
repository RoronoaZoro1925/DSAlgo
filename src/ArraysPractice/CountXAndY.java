package ArraysPractice;

import java.util.List;

public class CountXAndY {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        List<Integer> numbers = List.of();
        System.out.println(checkCountOfXandY(numbers,x,y));
    }

    private static int checkCountOfXandY(List<Integer> numbers, int x, int y) {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)==x) {
                countX++;
            }
            if (numbers.get(i)==y) {
                countY++;
            }
        }
        if (countX>countY) {
            return x;
        }
        else if (countX<countY){
            return y;
        }
        else
            return Math.min(x, y);
        
    }
}
