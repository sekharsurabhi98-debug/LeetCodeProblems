class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> al = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    List<Integer> ar = new ArrayList<>(Arrays.asList(i,j));
                    al.add(ar);
                }           
            }
        }
        

        for(List<Integer> lr : al){
            int r = lr.get(0);
            int c = lr.get(1);

       
            for(int i = 0; i < matrix[0].length; i++){
                matrix[r][i] = 0;
            }

            for(int i = 0; i < matrix.length; i++)
                matrix[i][c] = 0;
        }
        
    }
}