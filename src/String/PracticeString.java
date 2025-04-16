package String;

interface Parent{
    default void sayHello(){
        System.out.println("Parent says hello");
    }
}
class Child implements Parent{

//    public void sayHello() {
//        System.out.println("Child says Hello");
//    }
}
public class PracticeString
{
    public static void main(String[] args)
    {
        Parent c = new Child() ;
        c.sayHello();


    }



}
