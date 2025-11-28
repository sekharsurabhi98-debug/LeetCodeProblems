class Solution {
    public int reverseDegree(String s) {
        char ar[] = {'z','y','x','w','v','u','t' ,'s','r','q','p', 'o', 'n','m','l','k' ,'j','i','h','g','f','e','d','c','b','a'};
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
              sum += (((int)ar[s.charAt(i) - 97] - 97) + 1) * (i+1);
              
        }
        return sum;
    }
}