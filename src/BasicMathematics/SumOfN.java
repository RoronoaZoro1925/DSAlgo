package BasicMathematics;
public class SumOfN
{
    public static void main(String[] args) {
        int N=5;
        // System.out.println((Sum(N)));
        System.out.println(sumOfCubes(N));

    }
    public static int Sum(int N)
    {
        return N*(N+1)/2;
    }

    public static int sumOfCubes(int N){
        int sum = N*(N+1)/2;
        return Math.powExact(sum, 2);
    }

}
