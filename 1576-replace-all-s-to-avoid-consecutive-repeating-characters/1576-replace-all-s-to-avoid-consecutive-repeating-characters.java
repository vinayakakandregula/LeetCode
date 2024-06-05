class Solution {
    public char help(char p,char n){
        for(char c='b';c<='y';c++){
            if(c!=p&&c!=n)  return c;
        }
        return 'x';
    }
    public String modifyString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='?'){
                char p='a';
                char n='z';
                if(i>0) p=sb.charAt(i-1);
                if(i<s.length()-1)  n=s.charAt(i+1);
                char c=help(p,n);
                sb.append(c);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}