public class IterativePower
{
    public static void main(String[] args)
    {
        int x=4;
        int y=2;
        int result=1;
        while(y>0)
        {
            if (y%2!=0)
            {
                result=result*x;
            }
            x=x*x;
            y=y/2;
        }
        System.out.println(result);
    }
}
