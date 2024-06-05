class Solution {
    public int[] finalPrices(int[] prices) {
        int res[] = new int[prices.length];
		for (int i = 0; i < prices.length - 1; i++) {
			boolean b = true;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					res[i] = prices[i] - prices[j];
					b = false;
					break;
				}
			}
			if (b) {
				res[i] = prices[i];
			}
		}
        res[prices.length-1] = prices[prices.length-1];
        return res;
    }
}