public class ComputingPower
{
    public static void main(String[] args)
    {
        int x=2;
        int y=5;
        System.out.println(Power(x,y));
        System.out.println(morePower(x,y));

    }
    static int Power(int x, int y)
    {
        int result=1;
        for (int i = 1; i <=y ; i++)
        {
            result=result*x;
        }
        return result;
    }
    static int morePower(int x, int y)
    {
        if (y==0)
            return 1;
        int temp= morePower(x,y/2);
//        temp=temp*temp;
        if (y%2==0)
            return temp;
        else
            return temp*x;

    }
}
