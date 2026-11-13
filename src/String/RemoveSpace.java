package String;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = " g eek s";
        System.out.println(removeEmptySpaces(s));
    }

    static String removeEmptySpaces(String s){
        String jointString = s.replaceAll("\\s", "");
        return jointString;
    }
}
