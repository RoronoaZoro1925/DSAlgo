package RecursionPractice;

public class Subset
{
    public static void main(String[] args)
    {
        String str = "ABCD";
        set(str,"",0);

    }
    static void set(String str,String curr, int index)
    {
        if(index==str.length())
        {
            System.out.println(curr+" ");
            return;
        }
        set(str,curr,index+1);
        set(str,curr+str.charAt(index),index+1);
    }

}
