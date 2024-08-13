public class HCF
{
    public static void main(String[] args)
    {
        int N=75;
        int M=50;
//        System.out.println(GCD(M,N));
        System.out.println(moreEffHCF(N,M));

    }
    static int GCD(int M, int N)
    {
        int result = Math.min(M,N);
        while (result>0)
        {
            if(M%result==0 && N%result==0)
            {
                break;
            }
            result--;
        }
        return result;

    }
    static int moreEffHCF(int M, int N)
    {
        if (N==0)
            return M;
        else{
            return moreEffHCF(N,M%N);
        }


    }

}
