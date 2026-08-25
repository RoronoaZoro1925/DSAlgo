package ArraysPractice;

public class MissingArrayElement {
    public static void main(String[] args){
        int arr[] = {2,1};
        System.out.println(missingElement(arr));
    }
    public static int missingElement(int[] arr) {
        java.util.Arrays.sort(arr);
        if(arr[0]!=1)
            return 1;
        int i = 0;
        for(i = arr[0]; i < arr.length; i++){
            if(arr[i+1] != arr[i]+1){
                return arr[i]+1;
            }
        }
        return i+1;
    }
}
