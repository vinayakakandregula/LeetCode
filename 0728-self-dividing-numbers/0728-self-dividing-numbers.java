class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
		while (left <= right) {
			if (div(left)) {
				l.add(left);
			}
			++left;
		}
        return l;
    }
    private static boolean div(int left) {
		int n = left;
		while (n > 0) {
			if (n % 10 == 0) {
				return false;
			}
			if (left % (n % 10) != 0) {
				return false;
			}
			n = n / 10;
		}
		return true;
	}
}