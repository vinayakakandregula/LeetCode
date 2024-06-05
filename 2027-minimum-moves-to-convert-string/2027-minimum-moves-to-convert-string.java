class Solution {
    public int minimumMoves(String s) {
        int res = 0;
        int res1=0;
        while(res<s.length()){
            if(s.charAt(res)=='X'){
                res+=3;
                res1++;
            } else{
                res++;
            }
        }
        return res1;
    }
}