class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> li = new ArrayList();
        String str = "";
        for(int i=0;i<words.length;i++){
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(!str.equals(s)){
                li.add(words[i]);
                str = s;
            }
        }
        return li;
    }
}