class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs =  new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(!(hs.contains(nums[i]))) {
				hs.add(nums[i]);
			}
		}
		if(nums.length == hs.size()) {
            return false;
		} else {
            return true;
		}

    }
}