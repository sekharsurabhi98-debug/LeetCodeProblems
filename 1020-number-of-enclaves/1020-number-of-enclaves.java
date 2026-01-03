class Solution {
    public int numEnclaves(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;

        //traverse row boundaries if you found zero perform dfs

        for(int i = 0; i < c; i++){

            dfs(grid, 0, i);
            dfs(grid, r - 1, i);
        }

        //perform dfs on boundary columns

        for(int i = 0; i < r; i++){

            dfs(grid,i,0);
            dfs(grid,i, c - 1);
        }

        //count remaining ones
        int count = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1)
                  count++;
            }
        }
        return count;
    }


    private void dfs(int[][] grid, int i, int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
        return;

        grid[i][j] = 0;

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}