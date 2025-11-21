class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int l = 0;
        int maxLength = 0;
        if(s.length() == 1) return 1;
        for(int i = 0; i < s.length(); i++){
            int apc = 0;
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(j-1) == s.charAt(j))
                    apc++;
                if(apc > 1)
                    break;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
}