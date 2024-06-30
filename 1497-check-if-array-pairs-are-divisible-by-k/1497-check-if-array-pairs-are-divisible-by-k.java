class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderCounts = new int[k];
        
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            remainderCounts[rem]++;
        }

        if (remainderCounts[0] % 2 != 0)
            return false; 
        for (int i = 1; i <= k / 2; i++) {
            if (remainderCounts[i] != remainderCounts[k - i])
                return false;
        }

        return true;
    }
}
