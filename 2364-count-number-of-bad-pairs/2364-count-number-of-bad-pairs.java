import java.util.HashMap;
import java.util.Map;

class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = n * (n - 1) / 2; // Total number of pairs
        Map<Integer, Integer> freqMap = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            if (freqMap.containsKey(diff)) {
                goodPairs += freqMap.get(diff);
            }
            freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}
