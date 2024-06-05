class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  
        int[] res = new int[n];
        int start = n - k;
        
        for (int i = 0; i < n; i++) {
            if (start == n) {
                start = 0;
            }
            res[i] = nums[start++];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}