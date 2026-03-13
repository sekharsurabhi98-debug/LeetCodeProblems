class Solution {

    public String checkAround(int i, String s, boolean isEven){
        
        int l , r;
        if(isEven){
            l = i;
            r = i+1;
        }else{
            l = i - 1;
            r =  i + 1;
        }

        while(l >= 0 && r < s.length()){
            if(s.charAt(l) != s.charAt(r)){
                break;
            }
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
    public String longestPalindrome(String s){
        
        int start = 0;
        int length = 0;
        String result = "";
        for(int i = 0; i < s.length(); i++){
            
            String even = checkAround(i,s,true);
            String odd = checkAround(i,s,false);
            if(even.length() > result.length()){
                result = even;
            }
            if(odd.length() > result.length()){
                result = odd;
            }
        }
        return result;
    }    
}