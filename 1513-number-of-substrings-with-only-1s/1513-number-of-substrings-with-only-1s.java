class Solution {
    public int numSub(String s) {
        long sum = 0;
        int count = 0;
        long mod = (long) Math.pow(10,9) + 7;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }else{
                count = 0;
            }
            sum += count;
        }
        return (int)(sum % mod);
    }
}