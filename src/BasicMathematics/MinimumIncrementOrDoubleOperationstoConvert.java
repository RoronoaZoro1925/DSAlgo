package BasicMathematics;

public class MinimumIncrementOrDoubleOperationstoConvert {
    public static void main(String[] args){
        int arr[] = {16,16,16};
        System.out.println(minimumOperations(arr));
    }
    public static int minimumOperations(int[] arr) {
        int incrementOperations = 1;
        int doubleOperations = 0;
        for (int i : arr) {
            int divisorNumber = checkPrime(i); 
            if (divisorNumber == 2) {
                while(incrementOperations == i){
                    incrementOperations*=2;
                }
            }
            if (divisorNumber == 3) {
                while(incrementOperations == i){
                    incrementOperations+=1;
                }
            }
        }
        return incrementOperations;
    }
    public static int checkPrime(int n){
        if(n<=1)
            return -1;
        if(n % 2 == 0)
            return 2;
        if(n % 3 == 0)
            return 3;
        if(n % 5 == 0)
            return 5;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 )
                return i;
            if(n%(i+2)==0)
                return i+2;   
        }
        return -1;
    }
}
