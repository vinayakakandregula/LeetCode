class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
		}
		int count = 0;
        int count1=0, count2=0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
                count2++;
				if (count >= 1) {
                    return false;
				}
			} else if (arr[i] > arr[i + 1]) {
				count++;
                count1++;
			} else{
                return false;
            }
		}
        if(count1==0 || count2==0){
            return false;
        }
        return true;
    }
}