class Solution {
    public boolean isPalindrome(String s){
        int l = 0; int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s){
        String ls = "";
        for(int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s.length(); j++){
                sb.append(s.charAt(j));
                if(isPalindrome(sb.toString())){
                    if(sb.length() > ls.length())
                       ls = sb.toString();
                }
            }
        }
        return ls;
    }    
}