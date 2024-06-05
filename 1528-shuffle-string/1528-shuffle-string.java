class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
       int i=0;
       for(char ch:s.toCharArray())
       {
           arr[indices[i++]]=ch;
       }
        StringBuilder sl=new StringBuilder();
        for(char ch:arr)
        {
            sl.append(ch);
        }
        return sl.toString();
    }
}