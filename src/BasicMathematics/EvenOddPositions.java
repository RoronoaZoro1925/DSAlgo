package BasicMathematics;

public class EvenOddPositions {
    public static void main(String[] args) {
        int date = 12;
        int car[] = {2375, 7682, 2325, 2352};
        int fine[] = {250, 500, 350, 200};
        System.out.println(calculateTotalFine(date,car,fine));
    }

    private static long calculateTotalFine(int date, int[] car, int[] fine) {
        long totalFine = 0;
        for (int i = 0; i < car.length; i++) {
            if (date%2==0 && car[i]%2!=0) {
                totalFine+=fine[i];
            }
            else if (date%2!=0 && car[i]%2==0) {
                totalFine+=fine[i];
            }
        }
        return totalFine;
    }
}
