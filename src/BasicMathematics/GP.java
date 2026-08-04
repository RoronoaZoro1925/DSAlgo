package BasicMathematics;

public class GP {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int n=5;
        System.out.println(calculateGP(a,b,n));
    }

    private static double calculateGP(int a, int b, int n) {
        // calculate nth term of GP starting with a and second term b
        double r = (double) b / a;
        double result = a;
        // run loop until we reach the nth term
        for (int i = 1; i < n; i++) {
            result *= r;
        }
        return result;
    }

}
