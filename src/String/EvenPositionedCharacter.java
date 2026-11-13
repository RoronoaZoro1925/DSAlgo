package String;

public class EvenPositionedCharacter {
    public static void main(String[] args) {
        String s = "Geeks";
        for(int i = 0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if (i %2==0) {
                System.out.print(ch);
            }
        }
    }
}
