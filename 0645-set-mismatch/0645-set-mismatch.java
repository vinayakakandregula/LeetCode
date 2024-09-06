import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int sum = 0;
        int duplicate = -1;
        
        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num; 
            }
            set.add(num);
            sum += num;
        }
        
        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (sum - duplicate); 
        
        return new int[] {duplicate, missing};
    }
}
