class Solution {
    public int arrangeCoins(int n) {
        if(n ==1 ){
            return n;
        }
        int i = 1;
		int count = 0;
		while (count < n) {
			n = n - i;
			count++;
			i++;
		}
        return count;
    }
}