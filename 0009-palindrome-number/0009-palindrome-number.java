class Solution {
    public boolean isPalindrome(int x) {
        String s = ""+x;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i)+res;
		}
        if(s.equals(res)){
            return true;
        } else{
            return false;
        }
    }
}