class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for(int i=0,j=0;(j<g.length&&i<s.length);i++){
            if(s[i] >= g[j]){
                res++;
                j++;
            }
        }
        
//         int j = 0;
//         int i = 0;
        
//         int ans = 0;
        
//         while(i < g.length && j < s.length){
//             if(g[i] <= s[j]){                
//                 res++;
//                 i++;
//             }
//             j++;
//         }
        return res;
    }
}