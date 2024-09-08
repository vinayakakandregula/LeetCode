class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet();
		for (int integer : arr) {
			set.add(integer);
		}
		int rank = 1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer integer : set) {
			map.put(integer, rank++);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = map.get(arr[i]);
		}
        return arr;
    }
}