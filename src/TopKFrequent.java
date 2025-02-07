import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public int[] TopKFrequent(int[] nums, int k) {
        Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();

        for(int n : nums)
        {
            lookup.put(n, lookup.getOrDefault(n,0) + 1);
        }

        return new int[2];
    }

}
