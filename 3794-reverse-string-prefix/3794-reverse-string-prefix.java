class Solution {
    public String reversePrefix(String s, int k) {
        
        char[] ar = s.toCharArray();
        int l = 0;
        int r = k - 1;
        while(l < r){
            char temp = ar[l];
            ar[l] = ar[r];
            ar[r] = temp;
             l++;
             r--;
        }
       
    return String.valueOf(ar);  
    }
}