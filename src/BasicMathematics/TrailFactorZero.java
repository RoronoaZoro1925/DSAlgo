package BasicMathematics;
public class TrailFactorZero
{
    public static void main(String[] args)
    {
        int N =20;
//        System.out.println(trailZero(N));
        System.out.println(moreEffTrail(N));

    }
    static int trailZero(int N)
    {
        int count=0;
        int factorial=1;
        for (int i = 1; i <=N ; i++)
        {
            factorial=i*factorial;
        }

        while (factorial%10==0)
        {
            count++;
            factorial=factorial/10;
        }
       return count;

    }
    static int moreEffTrail(int N)
    {
        int result=0;
        for (int i = 5; i <=N ; i=i*5)
        {
            result=result+N/i;
        }
        return result;

    }
}
