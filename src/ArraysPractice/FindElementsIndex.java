package ArraysPractice;

public class FindElementsIndex {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int i = 2;
        System.out.println(findElement(i,arr));
    }

    static int findElement(int i, int[] arr){
        int element = arr[i];
        return element;
    }
}
