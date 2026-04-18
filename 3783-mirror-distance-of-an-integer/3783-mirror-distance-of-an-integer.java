class Solution {
    public int mirrorDistance(int n) {
       int n1 = n;
       int n2 = 0;
       while(n > 0){
        n2 = n2 * 10 + n % 10;
        n = n / 10;
       }

       n = Math.abs(n1 - n2);
       return n;
    }
}