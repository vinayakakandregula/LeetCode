class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			set.add(num);
		}
		if(!(set.contains(0))) {
            return set.size();
		} else {
			if(set.size()==1 && set.contains(0)) {
                return 0;
			} else {
                return set.size()-1;
			}
		}
    }
}