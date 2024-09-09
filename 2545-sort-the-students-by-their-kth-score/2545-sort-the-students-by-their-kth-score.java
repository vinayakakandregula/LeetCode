class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length; i++) {
			int min = i;
			for (int j = i + 1; j < score.length; j++) {				
				if (score[j][k]>score[min][k]) {
					min = j;
				}
			}
			int[] arr = score[min];
			score[min] = score[i];
			score[i] = arr;
		}
        return score;
    }
}