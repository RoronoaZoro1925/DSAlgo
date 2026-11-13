package ArraysPractice;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        for (int[] row: sortMatrices(mat)) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println(
                
            );
        } 
    }

    static int[][] sortMatrices(int mat[][]){
        int n = mat.length;
        int arr[] = new int[n*n]; 
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[k]=mat[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=arr[k];
                k++;
            }
            
        }
        return mat;
    }
}
