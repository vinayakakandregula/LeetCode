class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
		for (int i = left; i <= right; i++) {
			int num = i;
			int c = 0;
			while (num != 0) {
				if (num % 2 == 1)
					c++;
				num /= 2;
			}
			if (isPrime(c)) {
				count++;
			}
		}
		return count;
    }
    private static boolean isPrime(int num) {
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				c++;
			}
		}
		return c == 2;
	}

}