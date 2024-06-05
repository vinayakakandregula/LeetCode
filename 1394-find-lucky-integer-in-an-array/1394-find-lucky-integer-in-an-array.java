class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
		int[] frq = new int[502];
		for (int i = 0; i < arr.length; i++) {
			frq[arr[i]]++;
		}
		for (int i = 0; i < frq.length; i++) {
			if(frq[i]>0 && frq[i]==i) {
				res = i;
			}
		}
        return res;
    }
    
}