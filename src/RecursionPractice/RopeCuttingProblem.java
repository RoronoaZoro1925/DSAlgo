package RecursionPractice;

public class RopeCuttingProblem
{
    public static void main(String[] args)
    {
        int n=27,a=3,b=2,c=5;
        System.out.println(maximumPieces(n,a,b,c));

    }

    static int maximumPieces(int n, int a, int b, int c)
    {
        if (n==0)
            return 0;
        if (n <= -1)
        {
            return -1;
        }
        int result = Math.max(
                maximumPieces(n-a,a,b,c),
        maximumPieces( n-b,a,b,c)
        );
        maximumPieces(n-c,a,b,c);
        if(result==-1)
            return -1;
        return result+1;
    }
}

