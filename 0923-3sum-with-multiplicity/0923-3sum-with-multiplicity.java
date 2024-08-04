import java.util.HashMap;
import java.util.Map;

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int mod = 1_000_000_007;
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            count = (count + map.getOrDefault(target - arr[i], 0)) % mod;

            for (int j = 0; j < i; j++) {
                int twoSum = arr[i] + arr[j];
                map.put(twoSum, map.getOrDefault(twoSum, 0) + 1);
            }
        }

        return (int) count;
    }
}
