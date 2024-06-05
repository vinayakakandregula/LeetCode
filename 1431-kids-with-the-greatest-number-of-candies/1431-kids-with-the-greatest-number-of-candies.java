class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			int res = candies[i] + extraCandies;
			bool.add(check(candies, res));
		}
        return bool;
    }
    public static Boolean check(int[] candies, int res) {
		int count = 0;
		for (int i = 0; i < candies.length; i++) {
			if (res >= candies[i]) {
				count++;
			}
		}
		return count == candies.length;
	}
}