class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, balancedSubStrings = 0;
        for(char c : s.toCharArray()){
            if(c == 'L')
                count++;
            else 
              count--;
            if(count == 0)
               balancedSubStrings++;
        }
        return balancedSubStrings;
    }
}