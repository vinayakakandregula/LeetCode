class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int res[][] = new int[image.length][image.length];
		for (int i = 0; i < image.length; i++) {
			int a[] = revinvert(image[i]);
			res[i] = a;
		}
        return res;
    }
    public static int[] revinvert(int[] is) {
		int a[] = new int[is.length];
		int j = a.length-1;
		for (int i = 0; i < is.length; i++) {
			if(is[i]==0) {
				a[j--]= 1;
			} else {
				a[j--] = 0;
			}
		}
		return a;
	}

}