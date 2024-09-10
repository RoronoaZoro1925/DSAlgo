package BasicMathematics;

import java.util.Arrays;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int N=100;
//        allPrime(N);
        sieve(N);

    }
    static boolean isPrime(int i)
    {
        if (i==1)
            return true;
        if (i==2 || i==3)
            return true;
        if (i%2==0 || i%3==0)
            return false;
        for (int j = 5; j*j <=i ; j++)
        {
            if (i%j==0||i%(j+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    static void allPrime(int N)
    {
        for (int i = 2; i <=N ; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }

        }
    }
    static void sieve(int N)
    {
        if (N<=1)
            return;
        boolean isPrime[] = new boolean[N+1];
        Arrays.fill(isPrime,true);
        for (int i = 2; i*i<=N ; i++)
        {
            if (isPrime[i])
            {
                for (int j = i*i; j <=N ; j=j+i)
                {
                    isPrime[j]=false;

                }
            }

        }
        for (int i = 2; i <=N ; i=i+3)
        {
            if (isPrime[i])
                System.out.println(i + " ");

        }
    }
}
