package BasicMathematics;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(countPerfectSquares(n));
    }

    static int countPerfectSquares(int n){
        int count = (int)Math.floor(Math.sqrt(n-1));
        return count;
    }
}
