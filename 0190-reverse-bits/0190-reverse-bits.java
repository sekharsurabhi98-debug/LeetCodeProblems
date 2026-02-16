class Solution {

    private int solve(String s){
        int result = 0;
        for(int i = 0; i < 32; i++){
            result += ((int)(Math.pow(2,i))) * (s.charAt(i) - 48);
        }
        return result;
    }
    public int reverseBits(int n) {
        
        String bs = Integer.toBinaryString(n);

        int rel = 32 - bs.length();
        for(int i = 0; i < rel; i++){
            bs = '0' + bs;
        }

        return solve(bs);
    
    }
}