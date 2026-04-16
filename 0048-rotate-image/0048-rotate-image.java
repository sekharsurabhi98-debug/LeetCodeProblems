class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        
        int lc = 0, rc = matrix[0].length - 1;
        while(lc < rc){
        for(int r = 0; r < matrix.length; r++){
            int temp = matrix[r][lc];
            matrix[r][lc] = matrix[r][rc];
            matrix[r][rc] = temp;
        }
        lc++;
        rc--;
        }
    }
}