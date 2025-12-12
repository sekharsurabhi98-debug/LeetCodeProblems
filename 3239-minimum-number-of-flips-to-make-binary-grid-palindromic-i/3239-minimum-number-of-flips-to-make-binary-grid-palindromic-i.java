class Solution {
    public int minFlips(int[][] grid) {
        int rcount = 0;
        for(int i = 0; i < grid.length; i++){
            int zeroCount = 0;
            int onesCount = 0;
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    zeroCount++;
                }else{
                    onesCount++;
                }
            }
            rcount += (zeroCount > onesCount) ? onesCount : zeroCount;
        }
            int ccount = 0;
            for(int i = 0; i < grid[0].length; i++){
                int zeroCount = 0;
                int onesCount = 0;
                for(int j = 0; j < grid.length; j++){
                    if(grid[j][i] == 0 )
                        zeroCount++;
                    else
                       onesCount++;
                }
                ccount += (zeroCount > onesCount) ? onesCount : zeroCount;
            }
            return (ccount < rcount) ? ccount : rcount;
    }
}