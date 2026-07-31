import java.util.*;

public class greedyalogrithm1 {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];

        // Store index and value/weight ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) wt[i];
        }

        // Sort according to ratio (ascending)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalValue = 0;

        // Traverse from highest ratio to lowest
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= wt[idx]) {
                finalValue += val[idx];
                capacity -= wt[idx];
            } else {
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value = " + finalValue);
    }

}
