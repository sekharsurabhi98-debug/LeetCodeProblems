class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        //if control reached till here that means the digits array only consists on 9's
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }
}