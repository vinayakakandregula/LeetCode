class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int j = i; j < arr.length; j++) {
				al.add(arr[j]);
				if (al.size() % 2 != 0) {
					sum += sum(al);
				}
			}
		}
        return sum;
    }
    public static int sum(ArrayList<Integer> al) {
		int sum = 0;
		for (Integer integer : al) {
			sum += integer;
		}
		return sum;
	}

}