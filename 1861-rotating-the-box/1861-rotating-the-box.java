class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;
        for(char[] ch : boxGrid){
            int l = ch.length - 2;
            int r = ch.length - 1;
            while(l >= 0){
                if(ch[l] == '*'){
                    r = l - 1;
                    l = l - 2;
                }else if(ch[l] == '#' && ch[r] == '.'){
                    char temp = ch[l];
                    ch[l] = ch[r];
                    ch[r] = temp;
                    l--;
                    r--;
                }
                else if(ch[r] == '#'){
                  r--;
                  l--;
                }
                else if(ch[r] == '*'){
                r--;
                l--;
                }else{
                    l--;
                }
            }
        }
        char[][] res = new char[m][n];
        for(int r = 0; r < n; r++){
            for(int c = 0; c < m; c++){
                res[c][r] = boxGrid[r][c];
            }
        }
        //swapping
        int c1 = 0, c2 = n - 1;
        while(c1 < n / 2){
            c2 = n - c1 - 1;
            for(int r = 0; r < m; r++){
                char temp = res[r][c1];
                res[r][c1] = res[r][c2];
                res[r][c2] = temp;
            }
            c1++;
        }
        return res;
    }
}