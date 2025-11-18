class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length % 2 == 1) return true;
        for(int i = 0; i < bits.length - 1; i++){
            if(bits[i] == 0 && bits[i+1] == 0) return true;
        }
        return false;
    }
}