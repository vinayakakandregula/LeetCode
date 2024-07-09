class Solution {
    public int countSegments(String s) {
        String sp[] = s.split(" ");
		int count = 0;
		for (String string : sp) {
			if(check(string)) {
				count++;
			}
		}
        return count;
    }
    public static boolean check(String string) {
			int count=0;
			for (int i = 0; i < string.length(); i++) {
				if(string.indexOf(' ')!=-1) {
					count++;
				} else {
					return true;
				}
			}
			return !(count==string.length());
		}
}