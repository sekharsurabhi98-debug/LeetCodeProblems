class Solution {
    public int numIslands(char[][] grid) {

        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
        return;
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
 

    private void bfs(char[][] grid, int i, int j){
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i,j});
        grid[i][j] = '0';

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty()){

            int ar[] = queue.poll();
          
            for(int[] d:directions){
                i = ar[0] + d[0];
                j = ar[1] + d[1];
                if(i >= 0 && j >=0 && j < grid[0].length && i < grid.length && grid[i][j] == '1'){
                    queue.offer(new int[]{i, j});
                    grid[i][j] = '0';
                }
            }
        }
    }
}