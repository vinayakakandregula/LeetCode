import java.util.Collection;
class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, List<Integer>> tree = new TreeMap<>();

		for (int i = 0; i < arr.length; i++) {
			int n = bits(arr[i]);

			List<Integer> list = tree.getOrDefault(n, new ArrayList<>());

			list.add(arr[i]);

			tree.put(n, list);
		}
		int res[] = new int[arr.length];
		int itr = 0;
		Collection<List<Integer>> set = tree.values();
		for (List<Integer> list : set) {
			list.sort((o1, o2) -> {
				return o1 - o2;
			});
			for (Integer list2 : list) {
				res[itr++] = list2;
			}
		}
        return res;
    }
    private static Integer bits(int n) {
		int count = 0;
		while (n != 0) {
			count += n % 2;
			n /= 2;
		}
		return count;
	}

}