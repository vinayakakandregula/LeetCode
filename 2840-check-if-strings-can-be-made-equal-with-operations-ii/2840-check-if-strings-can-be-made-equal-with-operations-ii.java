class Solution {
    public boolean checkStrings(String s1, String s2) {
        boolean result = canBeEqual(s1, s2);
        return result;
    }
    public static boolean canBeEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] evenS1 = new char[(s1.length() + 1) / 2];
        char[] oddS1 = new char[s1.length() / 2];
        char[] evenS2 = new char[(s2.length() + 1) / 2];
        char[] oddS2 = new char[s2.length() / 2];

        for (int i = 0, e = 0, o = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenS1[e] = s1.charAt(i);
                evenS2[e] = s2.charAt(i);
                e++;
            } else {
                oddS1[o] = s1.charAt(i);
                oddS2[o] = s2.charAt(i);
                o++;
            }
        }

        Arrays.sort(evenS1);
        Arrays.sort(oddS1);
        Arrays.sort(evenS2);
        Arrays.sort(oddS2);

        return Arrays.equals(evenS1, evenS2) && Arrays.equals(oddS1, oddS2);
    }

}