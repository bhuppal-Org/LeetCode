import java.util.*;

public class KidsGreatestNoofCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int maxCandyCount = candies[0];
        for(int item : candies) {
            if(item > maxCandyCount) {
                maxCandyCount = item;
            }
        }
        for(int item: candies) {
            if(item+extraCandies >= maxCandyCount) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = new int[]{12, 1, 12};
        System.out.println(Arrays.stream(candies).max().getAsInt());
        List<Boolean> result = kidsWithCandies(candies, 10);
        System.out.println(result);
    }
}
