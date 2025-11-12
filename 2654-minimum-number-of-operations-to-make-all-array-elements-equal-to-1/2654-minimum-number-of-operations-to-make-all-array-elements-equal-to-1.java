class Solution {
    public int gcd(int a, int b){
        int x = Math.min(a,b);
        int y = Math.max(a,b);
        int t = 0;
        while(y % x != 0){
            t = x;
            x = y % x;
            y = t;
        }
        return x;
    }
    public int minOperations(int[] nums) {
        int count = 0;
        for(int n :nums) if(n == 1) count++;
        if(count == nums.length) return 0;
        if(count >= 1) return nums.length - count;
        int oneIdx = 0;
        boolean found = false;
        int op = 0;
        for(int size = 2; size <= nums.length;size++){
            for(int i = 0; i <= nums.length - size; i++){
                int[] ar = new int[size];
                int idx = 0;
                for(int j = i; j < i+size; j++){
                     ar[idx++] = nums[j];
                }
                
                int num1 = nums[0];
                for(int j = 0; j < ar.length - 1; j++){
                   int res = gcd(ar[j],ar[j+1]);
                   if(res == 1){
                    found = true; 
                    if(ar[j] == 1)
                      op = 0;
                    else
                    op = size - 1; 
                    break;
                  }
                  ar[j+1] = res;
                }
                if(found)
                  break;
            }
            if(found)
            break;
        }
        
        if(!found) return -1;
        return op + nums.length - 1;
    }
}