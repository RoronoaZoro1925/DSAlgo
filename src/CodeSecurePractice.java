import java.util.concurrent.*;


public class CodeSecurePractice
{


    public static void main(String[] args)
    {
        String s = null;
        call(s);

    }

    public static void call(Object ob)
    {
        System.out.println("Object method called");

    }

    public static void call(String s)
    {
        System.out.println("String method called");
    }





}















