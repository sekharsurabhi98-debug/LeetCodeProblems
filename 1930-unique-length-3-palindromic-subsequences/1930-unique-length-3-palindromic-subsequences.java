class Solution {
    public int countPalindromicSubsequence(String s) {
       int result = 0;
       Set<Character> letters = new HashSet<>();
       for(char c : s.toCharArray())
            letters.add(c);
       for(char letter : letters){
          int i = -1;
          int j = 0;
          for(int k = 0; k < s.length(); k++){
            if(s.charAt(k) == letter){
                if(i == -1)
                    i = k;
                j = k;
            }
          }
          Set<Character> between = new HashSet<>();
          for(int k = i+1; k < j; k++){
              between.add(s.charAt(k));
          }
          result += between.size();
       }
       return result;
    }
}