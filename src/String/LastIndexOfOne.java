package String;

public class LastIndexOfOne {
    public static void main(String[] args) {
        String s = "01010";
        System.out.println(checkLastIndex(s));
        System.out.println(efficientLastIndex(s));
    }

    static int checkLastIndex(String s){
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)=='1') {
                return i;
            }
        }
        return -1;
    }

    static int efficientLastIndex(String s){
        int lastIndex = s.lastIndexOf("1");
        return lastIndex;
    }
}
