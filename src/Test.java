public class Test {
    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        try{
            return 1;
        }
        finally {
            System.out.println("finally runs");
        }
    }
}
