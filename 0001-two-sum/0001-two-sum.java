class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n[] = new int[2];
		int count=0;
		System.out.println(target);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					n[0] = i;
					n[1] = j;
					count++;
					break;
				}
			}
			if(count==1) {
				break;
			}
		}
		return n;

    }
}