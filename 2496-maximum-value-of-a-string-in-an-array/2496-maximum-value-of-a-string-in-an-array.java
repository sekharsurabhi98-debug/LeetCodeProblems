class Solution {
    public int maximumValue(String[] strs) {
        int maxLength = 0;
        for(String s:strs){
            boolean take = true;
            for(char c : s.toCharArray()){
                if(!(c >= 48 && c <= 57)){
                     take = false;
                     break;
                }
            }
            if(!take){
                maxLength = Math.max(maxLength, s.length());
            }else{
                maxLength = Math.max(maxLength, Integer.parseInt(s));
            }
        }
        return maxLength;
    }
}