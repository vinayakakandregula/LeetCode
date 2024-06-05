class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i > j) {
					break;
				}
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if(al.contains(count)) {
                return false;
			}
			if (count > 0) {
				al.add(count);
			}
		}
        return true;
    }
}