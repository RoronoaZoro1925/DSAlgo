public class PrimalFactors
{
    public static void main(String[] args)
    {
        int N =450;
        moreEffPrime(N);

    }
    static void  primeNumber(int N){
        if(N<=1)
            return;
        for (int i = 2; i*i <=N ; i++)
        {
            while (N%i==0){
                System.out.println(i);
                N=N/i;
            }
        }
        if (N>1)
            System.out.println(N);
    }
    static void moreEffPrime(int N)
    {
        if (N<=1)
            return;
        while (N%2==0)
        {
            System.out.println(2);
            N=N/2;
        }
        while (N%3==0)
        {
            System.out.println(3);
            N=N/3;
        }
        for (int i = 5; i*i <=N ; i=i+6)
        {
            while (N%i==0)
            {
                System.out.println(i);
                N=N/i;
            }
            while (N%(i+2)==0)
            {
                System.out.println(i+2);
                N=N/(i+2);
            }

        }
        if (N>3)
            System.out.println(N);

    }
}
