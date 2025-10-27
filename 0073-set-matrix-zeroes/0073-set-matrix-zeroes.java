class Solution {
    public void setZeroes(int[][] m) {
        List<List<Integer>> list = new ArrayList<>();
        for(int r = 0; r < m.length;r++){
            for(int c = 0; c < m[0].length;c++){
                if(m[r][c] == 0){
                    List<Integer> t = new ArrayList<>();
                    t.add(r);
                    t.add(c);
                    list.add(t);
                }
            }
        }
        //set rows as zero
       for(int i = 0; i < list.size();i++){
         for(int c = 0; c < m[0].length;c++){
            m[list.get(i).get(0)][c] = 0;
        }
        for(int r = 0; r < m.length;r++){
            m[r][list.get(i).get(1)] = 0;
        }
       }
    }
}