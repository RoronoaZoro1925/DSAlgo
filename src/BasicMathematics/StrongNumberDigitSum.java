package BasicMathematics;

public class StrongNumberDigitSum {
    public static void main(String[] args) {
        int n = 145;
        System.out.println(checkStrongNumber(n));
    }

    static boolean checkStrongNumber(int n){
        boolean flag = false;
        int sum = 0;
        int temp = n;
        while (temp>0) {
            int digit =temp%10;
            int factorial = getFactorial(digit);
            sum+=factorial;
            temp/=10;
        }
        if (sum==n) {
            flag = true;
        }
        return flag;
    }

    static int getFactorial(int n){
        if (n==0) {
            return 1;
        }
        return n*getFactorial(n-1);
    }
}
