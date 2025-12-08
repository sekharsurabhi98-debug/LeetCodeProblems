class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int l = 0, r = 0;
        while(r < s.length()){

            while(!set.add(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            if(r - l + 1 > maxLength)
                 maxLength = r - l + 1;
            r++;
        }
        return maxLength;
    }
}