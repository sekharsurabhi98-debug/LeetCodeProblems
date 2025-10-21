class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(char c : jewels.toCharArray()){
            for(char ch : stones.toCharArray()){
                if(c == ch)
                    result++;
            }
        }
        return result;
    }
}