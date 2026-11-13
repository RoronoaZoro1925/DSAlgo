package BasicMathematics;

public class SumAndPalindrome {
    public static void main(String[] args) {
        int n = 54;
        System.out.println(calculateSumAndCheckPalindrome(n));
    }

    static boolean calculateSumAndCheckPalindrome(int n){
        int sum = String.valueOf(Math.abs(n)).chars().map(Character::getNumericValue).sum();
        return checkPalindrome(sum);
    }

    static boolean checkPalindrome(int n){
        if (n<0) {
            return false;
        }
        int orignalNumber = n;
        int reversedNumber = 0;
        while (n!=0) {
            int remainder = n%10;
            reversedNumber = reversedNumber*10+remainder;
            n/=10;
        }
        return orignalNumber==reversedNumber;
    }
}
