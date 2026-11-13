package BasicMathematics;

public class ClosesDivisible {
    
    public static void main(String[] args) {
        int N=-15;
        int M=6;
        System.out.println(closeDivisible(N,M));
        // System.out.println(closestDivisible(N,M));
    }

    public static int closeDivisible(int N, int M){
        int dividend = N % M;
        System.out.println(dividend);
        int lower = N - dividend;
        return 0;
    }

    public static int closestDivisible(int N, int M){
        int lower = N - (N % M);
        int higher = lower + M;

        if (Math.abs(N - lower) <= Math.abs(N - higher)) {
            return lower;
        } else {
            return higher;
        }
    }
}
