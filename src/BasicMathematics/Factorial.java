package BasicMathematics;

public class Factorial
{
    public static void main(String[] args) {
        long n = 7;
        System.out.println(factorial(n));
        System.out.println(Character.SIZE);

    }
    public static long factorial(long n){
//        long res = 1;
//        for (long i = 2; i <= n; i++) {
//            res=res*i;
//        }
//        return res;
        if (n==0)
            return 1;
        return n*factorial(n-1);
    }
}
