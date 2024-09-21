class Solution {
    public int minimumDifference(int[] arr, int k) {
        if(arr.length==1){
            return 0;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
		int i = 0 ;
        int j = k-1;
        while(j<arr.length){
            min = Math.min(min, Math.abs(arr[i] - arr[j]));
            i++;
            j++;
        }
        return min;
    }
}