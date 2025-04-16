import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }

    public static void main(String[] args) {
//        EmployeeDemo ed = ()->"Pata Chala";
//        System.out.println(ed.getName());

        List<Integer> random = Arrays.asList(1,2,3,4);
        List<Integer> newList=random.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(newList);
    }
}