class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int[][] matrix = new int[m][n];
        for(int[] ar: guards){
            int r = ar[0];
            int c = ar[1];
            grid[r][c] = 1;
            matrix[r][c] = 1;
        }
        for(int[] ar: walls){
            int r = ar[0];
            int c = ar[1];
            grid[r][c] = 2;
            matrix[r][c] = 1;
        }
      
 
        for(int[] ar : guards){
            int r = ar[0];
            int c = ar[1];
            //right
            for(int col = c + 1; col < n; col++){
                if(grid[r][col] == 1 || grid[r][col] == 2) break;
                matrix[r][col] = 1;
            }
            //left
             for(int col = c - 1; col >= 0; col--){
                if(grid[r][col] == 1 || grid[r][col] == 2) break;
                matrix[r][col] = 1;
            }
            //down
            for(int row = r+1; row < m; row++){
                if(grid[row][c] == 1 || grid[row][c] == 2 ) break;
                matrix[row][c] = 1;
            }
            //up
            for(int row = r-1; row >= 0; row--){
                if(grid[row][c] == 1 || grid[row][c] == 2 ) break;
                matrix[row][c] = 1;
            }
        }
        for(int[] ar : matrix)
           System.out.println(Arrays.toString(ar));
        int sum = 0;
        for(int ar[] : matrix){
           for(int v :ar){
            if(v == 0)
               sum++;
           }
        }

        return sum;
    }
}