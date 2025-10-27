class Solution {
    public int numberOfBeams(String[] bank) {
        int preBeams = 0;
        int totalBeams = 0;
        for(int i = 0; i < bank.length; i++){
            int presentBeams = 0;
            for(char c : bank[i].toCharArray()){
                if(c == '1')
                    presentBeams++;
            }
            if(presentBeams > 0){
                totalBeams += preBeams * presentBeams;
                preBeams = presentBeams;
            }
           
        }
        return totalBeams;
    }
}