class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] res = new int[n * m];
        int idx = 0;
        if(mat.length == 1) return mat[0];
        for(int d = 0; d < m+n - 1; d++){
            int r = (d < m) ? 0 : d - m + 1;
            int c = (d < m) ? d : m - 1;
            List<Integer> al = new ArrayList<>();
            while(r < n && c >= 0){
                al.add(mat[r][c]);
                r++;
                c--;
            }
            if(d % 2 == 0){
                for(int i = al.size() - 1; i >= 0; i--){
                     res[idx++] = al.get(i);
                }
            }else{
                for(int i = 0 ; i < al.size(); i++){
                     res[idx++] = al.get(i);
                }
            }
        }
        return res;
    }
}