class Solution {
    public int passThePillow(int n, int time) {
        int ball = 0;
		int d = 1;

		for (int i = 0; i < time; i++) {
			if (d == 1) {
				if (ball == n - 1) {
					d = -1;
				}
				ball += d;
			} else {
				if (ball == 0) {
					d = 1;
				}
				ball += d;
			}
		}

        return ball+1;
    }
}