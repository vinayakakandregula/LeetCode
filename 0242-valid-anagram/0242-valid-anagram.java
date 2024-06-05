class Solution {
    public boolean isAnagram(String s, String t) {
      
		if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            int count = charCount.get(c) - 1;
            if (count == 0) {
                charCount.remove(c);
            } else {
                charCount.put(c, count);
            }
        }
        
        return charCount.isEmpty();	

    }
}