import java.util.PriorityQueue;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1_000_000_007;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                minHeap.offer(sum);
            }
        }
        
        int result = 0;
        
        for (int i = 1; i <= right; i++) {
            int val = minHeap.poll();
            if (i >= left) {
                result = (result + val) % mod;
            }
        }
        
        return result;
    }
}
