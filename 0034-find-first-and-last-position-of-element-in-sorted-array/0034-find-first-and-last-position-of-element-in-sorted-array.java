class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
		res[0] = -1;
		res[1] = -1;
        int count=0,j=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				if(count==0){
                    res[j++] = i;
                    count++;
                }
                res[j++] = i;
                j=1;
			}
		}
        return res;
    }
}