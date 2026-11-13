package BasicMathematics;

public class ReplaceAllZeroWithFive {
    public static void main(String[] args) {
        int n = 1004;
        System.out.println(convertFive(n));
    }

    static int convertFive(int n){
        int newNumber = Integer.parseInt(String.valueOf(n).replace('0', '5'));
        return newNumber;
    }
}
