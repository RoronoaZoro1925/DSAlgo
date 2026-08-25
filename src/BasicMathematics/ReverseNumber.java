package BasicMathematics;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 122;
        System.out.println(reverseDigits(n));
    }

    public static int reverseDigits(int n){
        int reversed = 0;
        while (n!=0) {
            int remainder = n%10;
            reversed = (reversed*10)+remainder;
            n=n/10;
        }

        return reversed;
    }
}
