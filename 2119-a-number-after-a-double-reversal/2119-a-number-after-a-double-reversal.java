class Solution {
    public boolean isSameAfterReversals(int num) {
            int temp = rev(num);
			int res = rev(temp);
			if (res == num) {
				return true;
			}else {
				return false;
			}

    }
    private static int rev(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum * 10 + num % 10;
			num /= 10;
		}
		return sum;
	}
}