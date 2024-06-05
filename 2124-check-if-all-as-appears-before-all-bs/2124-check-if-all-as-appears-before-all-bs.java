class Solution {
    public boolean checkString(String s) {
        char ch = 'b';
		for (int i = 0; i < s.length(); i++) {
			if(ch==s.charAt(i)) {
				if(s.substring(i).indexOf('a')!=-1) {
					return false;
				}
			}
		}
        return true;
    }
}