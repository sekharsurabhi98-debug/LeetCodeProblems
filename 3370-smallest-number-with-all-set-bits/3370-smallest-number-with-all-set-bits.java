class Solution {
    public int smallestNumber(int n) {
        if((n & (n+1)) == 0) return n;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int r = n % 2;
            sb.append(r);
            n = n / 2;
        }
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '0') sb.setCharAt(i,'1');
        }
        int res = 0;
        // for(int i = sb.length() - 1; i >= 0; i--){
        //     res += 2 ** 
        // }
        return (int)Math.pow(2,sb.length()) - 1;
    }
}