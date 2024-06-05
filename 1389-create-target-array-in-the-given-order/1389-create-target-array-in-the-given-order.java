class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        		List<Integer> al = new ArrayList<Integer>();
		int target[] = new int[nums.length];
		for (int i = 0, j = 0; i < nums.length; i++) {
			al.add(index[i],nums[i]);
		}
		for (int i = 0; i < al.size(); i++) {
			target[i] = al.get(i);
		}
        return target;
    }
}