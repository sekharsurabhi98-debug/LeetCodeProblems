class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count1 = 0;
        int count2 = 0;
        for(char c : moves.toCharArray()){
            if(c == 'L' || c == '_'){
                count1++;
            }
            else {
            count1--;
            }
        }

         for(char c : moves.toCharArray()){
            if(c == 'R' || c == '_'){
                count2++;
            }
            else {
            count2--;
            }
        }
        return Math.max(count1, count2);
    }
}