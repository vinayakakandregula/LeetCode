class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int r = 0,r1=0;
		for (int i = 0; i < nums.length; i++) {
			if(prime(nums[i])) {
				r1 = i;
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(prime(nums[i])) {
				r = i;
			}
		}
        return r-r1;
    }
    public static boolean prime(int i) {
		int c=0;
		for (int j = 1; j < i; j++) {
			if(i%j==0) {
				c++;
			}
		}
		return c==1;
	}

}