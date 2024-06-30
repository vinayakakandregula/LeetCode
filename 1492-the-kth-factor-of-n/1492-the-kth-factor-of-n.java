class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list =  new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		int res = -1;
		if(list.size()>=k) {
			res = list.get(k-1);
		}
        return res;
    }
}