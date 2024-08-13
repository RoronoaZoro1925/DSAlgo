import java.util.List;
import java.util.stream.Collectors;

public class AddString
{
    public static void main(String[] args) {
        List<String> list = List.of("Rohit","Virat","Jaddu");
        System.out.println(list.stream().collect(Collectors.joining(",")));
    }
}
