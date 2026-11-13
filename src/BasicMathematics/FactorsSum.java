package BasicMathematics;

public class FactorsSum {
    public static void main(String[] args) {
        int n = 10;
        // System.out.println(checkTrueNumber(n));
        System.out.println(effficientCheckTrueNumber(n));
    }

    static boolean checkTrueNumber(int n){
        boolean flag = false;
        int sum = 0;
        int divisor = 1;
        while (divisor<n) {
            if (n%divisor == 0) {
                sum+=divisor;
            }
            divisor++;
        }
        if (sum == n) {
            flag = true;
        }
        
        return flag;
    }

    static boolean effficientCheckTrueNumber(int n){
        if (n<=1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0) {
                sum+=i;
                if (i*i!=n) {
                    sum+=n/i;
                }
            }

        }
        return sum==n;
    }
}
