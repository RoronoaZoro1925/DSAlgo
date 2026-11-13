package ArraysPractice;

import java.util.Arrays;

public class SumOfMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 0, 1}, {-8, 9, -2}};
        // System.out.println(calculateSum(mat));
        System.out.println(efficientSum(mat));
        System.out.println(advancedJavaApproach(mat));
    }

    static int calculateSum(int mat[][]){
        int sum = 0;
        int n = mat.length;
        int arr[] = new int [n*n];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                arr[k]=mat[i][j];
                k++;
            }
        }
        k=0;
        for (int i = 0; i < arr.length; i++) {
            arr[k]+=sum;
            k++;
        }
        return sum;
    }

    static int efficientSum(int[][] mat){
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum+=mat[i][j];
            }
        }
        return sum;
    }

    static int advancedJavaApproach(int mat[][]){
        return Arrays.stream(mat).flatMapToInt(Arrays::stream).sum();
    }
}
