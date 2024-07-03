class Solution {
    public int countTriplets(int[] arr) {
        int res=0;
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            int val = arr[i];
            for (int k = i+1; k < n; ++k) {
                val ^= arr[k];
                if (val == 0) {
                    res += k-i;
                }
            }
        }
        return res;
    }
}