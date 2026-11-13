package ArraysPractice;

public class FirstOccurenceInSorted {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 2};
        int k = 1;
        // System.out.println(checkFirstOccurence(arr,k));
        // System.out.println(checkWithBinarySearch(arr, k));
        System.out.println(firstSearch(arr, k));
    }

    private static int checkFirstOccurence(int[] arr, int k) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static int checkWithBinarySearch(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==k) {
                return mid;
            }
            else if (arr[mid]>k) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int firstSearch(int[] arr, int k) {
        // Code Here
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<k){
                low=mid+1;
            }else if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]==k){
                if(mid>0&&arr[mid-1]==k){
                    high=mid-1;
                    continue;
                }
                return mid;
            }
        }
        return -1;
    }
}

