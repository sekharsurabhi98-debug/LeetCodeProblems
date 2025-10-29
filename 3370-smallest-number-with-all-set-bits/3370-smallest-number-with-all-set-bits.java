class Solution {
    public int smallestNumber(int n) {
        /*if((n & (n+1)) == 0) return n;
        //StringBuilder sb = new StringBuilder();
        int c = 0;
        while(n > 0){
            int r = n % 2;
            sb.append(r);
            n = n / 2;
            c++;
        }
        // for(int i = 0; i < sb.length(); i++){
        //     if(sb.charAt(i) == '0') sb.setCharAt(i,'1');
        // }
        // int res = 0;
        // for(int i = sb.length() - 1; i >= 0; i--){
        //     res += Math.pow(2,i) * (sb.charAt(i) - 48);
        // }
        //return res;
        return (int)Math.pow(2,Integer.toBinaryString(n).length())-1;*/
        int x = n;
        while((x & (x + 1)) != 0)
           x++;
        return x;
    }
}