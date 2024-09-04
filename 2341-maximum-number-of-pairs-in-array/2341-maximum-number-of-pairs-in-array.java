class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count = 0;
		int ii=-1;
		int jj=-1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					nums[i] = ii--;
					nums[j] = jj--;
					break;
				}
			}
		}
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				c++;
			}
		}
		int res[] = new int[2];
        if(nums.length==1){
            res[0] = 0;
            res[1] = 1;
            return res;
        }
		res[0] = count;
		res[1] = c;
        return res;
    }
}