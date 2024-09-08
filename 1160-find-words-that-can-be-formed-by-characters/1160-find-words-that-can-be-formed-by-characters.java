class Solution {
    public int countCharacters(String[] words, String chars) {
       int sum = 0;

		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			String temp = chars;
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				int index = temp.indexOf(str.charAt(j));
				if (index != -1) {
					count++;
					temp = temp.substring(0, index) + temp.substring(index + 1);
				}
			}
			if (count == str.length()) {
				sum += str.length();
			}
        }
        return sum;
    }
}