import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedyalogrithm4 {
    public static void main(String args[]) {
        Integer Coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Arrays.sort(Coins, Comparator.reverseOrder());
        int countofCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < Coins.length; i++) {
            if (Coins[i] <= amount) {
                while (Coins[i] <= amount) {

                    ans.add(Coins[i]);
                    amount -= Coins[i];

                }
            }
        }
        System.out.println("total coins are used are" + ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
