class Solution {
    public int countCollisions(String s) {
        int collision = 0;
        int lri = -1;
        int lli = -1;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L')
                 lli = i;
            else 
            break;
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == 'R')
                 lri = i;
            else 
            break;
        }
        if(lli == -1) lli = 0; else lli++;
        if(lri == -1) lri = s.length();
        for(int i = lli; i < lri; i++){
            if(s.charAt(i) != 'S')
               count++;
        }
        return count;
    }
}