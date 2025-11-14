class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int [][] grid = new int[n][n];
        for(int[] ar : queries){
            int sr = ar[0];
            int sc = ar[1];
            int er = ar[2];
            int ec = ar[3];
            for(int r = sr; r <= er; r++){
                for(int c = sc; c <= ec; c++){
                    grid[r][c] += 1;
                }
            }
        }
        return grid;
    }
}