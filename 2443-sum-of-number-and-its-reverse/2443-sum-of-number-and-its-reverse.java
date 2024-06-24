class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++) {
			int value = 0;
			int value1 = i;
			value = rev(i);
			if (value + value1 == num) {
                return true;
			}
		}
        return false;
    }
    public static int rev(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num /= 10;
		}
		return sum;
	}
}