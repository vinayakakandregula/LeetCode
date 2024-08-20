class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					ans.add(arr2[i]);
					arr1[j] = -1;
				}
			}
		}
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > -1) {
				res.add(arr1[i]);
			}
		}
		Collections.sort(res);
		ans.addAll(res);
		int[] result = new int[ans.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = ans.get(i);
		}
        return result;
    }
}