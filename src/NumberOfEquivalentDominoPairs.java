import java.util.HashMap;
import java.util.Map;

public class NumberOfEquivalentDominoPairs {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int counter = 0;
        Map<Integer, Integer> hmap = new HashMap<>();

        for(int[] pair: dominoes){
            int small = Math.min(pair[0], pair[1]);
            int big = Math.max(pair[0], pair[1]);
            int key = small * 10 + big;
            counter += hmap.getOrDefault(key, 0);
            hmap.put(key, hmap.getOrDefault(key, 0) + 1);
        }
        return counter;
    }

    public static void main(String[] args) {
        int [][] d = new int[][]{{1,2},{2,1}, {5,6}, {3,4}};

        int t = numEquivDominoPairs(d);
        System.out.println(t);

    }
}
