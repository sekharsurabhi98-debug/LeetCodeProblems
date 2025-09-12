//Solution
   // approach just count how many number of vowels
   // if vowels are there then Alice wins return true else false
   class Solution {
    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }
    public boolean doesAliceWin(String s) {
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i)))
               c++;
        }
        return c > 0;
    }
}
   
