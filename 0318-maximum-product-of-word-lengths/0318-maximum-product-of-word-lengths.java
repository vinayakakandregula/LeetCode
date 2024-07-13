class Solution {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }

        int n = words.length;
        int[] masks = new int[n];
        int[] lens = new int[n];

        for (int i = 0; i < n; i++) {
            masks[i] = createBitmask(words[i]);
            lens[i] = words[i].length();
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) { 
                    res = Math.max(res, lens[i] * lens[j]);
                }
            }
        }
        return res;
    }

    private int createBitmask(String word) {
        int bitmask = 0;
        for (char c : word.toCharArray()) {
            bitmask |= 1 << (c - 'a');
        }
        return bitmask;
    }
}




















// class Solution {
//     public int maxProduct(String[] str) {
//         int res =0;
//         if(str.length ==0 && str == null){
//             return 0;
//         }
// 		for (int i = 0; i < str.length; i++) {
// 			for (int j = i+1; j < str.length; j++) {
// 				if( (check(str[i], str[j])) !=0 && check(str[i], str[j])>res) {
// 					res = check(str[i], str[j]);
// 				}
// 			}
// 		}
//         return res;
//     }
//     public static int check(String s1, String s2) {
// 			String s3 = "";
// 			String s4 = "";
// 			s3 = (s1.length() >= s2.length()) ? s1 : s2;
// 			s4 = (s1.length() >= s2.length()) ? s2 : s1;
// 			for (int i = 0; i < s3.length(); i++) {
// 				if (s4.indexOf(s3.charAt(i)) != -1) {
// 					return 0;
// 				}
// 			}
// 			return s3.length()*s4.length();
// 		}
// }