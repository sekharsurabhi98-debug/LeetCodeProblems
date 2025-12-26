class Solution {
    // public int ncount(String s){
    //     int count = 0;
    //     for(char c:s.toCharArray()){
    //         if(c == 'N')
    //            count++;
    //     }
    //     return count;
    // }
    // public int ycount(String s){
    //     int count = 0;
    //     for(char c:s.toCharArray()){
    //         if(c == 'Y')
    //            count++;
    //     }
    //     return count;
    // }
    // public int calculatePenalty(String s, int idx){
    //     if(idx == s.length()) return ncount(s);
    //     if(idx == 0) return ycount(s);
    //     int count = 0;
    //     int l = 0;
    //         while(l < idx){
    //             if(s.charAt(l) == 'N'){
    //                 count++;
    //             }
    //             l++;
    //         }
    //         int r = idx+1;
    //         while(r < s.length()){
    //             if(s.charAt(r) == 'Y'){
    //                 count++;
    //             }
    //             r++;
    //         }
    //         if(s.charAt(idx) == 'Y') count++;
    //     return count;
    // }
    public int bestClosingTime(String s) {

        int[] yes = new int[s.length() + 1];
        int[] no = new int[s.length() + 1];
        int minIdx = 0;
        int sum = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == 'Y'){
                sum++;
            }
            yes[i] = sum;
        }
        System.out.println();
        sum = 0;
        for(int i = 1; i < no.length; i++){
           if(s.charAt(i-1) == 'N'){
              sum++;
           }

           no[i] = sum;
           
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < yes.length; i++){
              
            if(yes[i] + no[i] < min){

                min = yes[i] + no[i];
                minIdx = i;
            }

        }
        return minIdx;
    }
}