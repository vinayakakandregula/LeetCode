class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length < 3){
            return nums;
        }
        List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				even.add(nums[i]);
			} else {
				odd.add(nums[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		Collections.reverse(odd);
		int[] res = new int[nums.length];
		for (int i = 0, j = 0, k = 0; i < res.length; i++) {
			if (i % 2 == 0) {
				res[i] = even.get(j++);
			} else {
				res[i] = odd.get(k++);
			}
		}
        return res;
    }
}