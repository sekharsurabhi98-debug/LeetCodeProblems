class Solution {
    
    public int expandToFindMaxLength(String s, int l, int r){
        int maxLen = 1;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        System.out.println(r - l - 1);
        return r - l - 1;
    }
    public String longestPalindrome(String s){
        int l = 0, r = 0, maxLength = 0, start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int odd = expandToFindMaxLength(s,i-1,i+1);
            int even = expandToFindMaxLength(s,i,i+1);
            int max = Math.max(odd,even);
            if(maxLength < max){
                maxLength = max;
                start = i - (max - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end+1);
    }    
}