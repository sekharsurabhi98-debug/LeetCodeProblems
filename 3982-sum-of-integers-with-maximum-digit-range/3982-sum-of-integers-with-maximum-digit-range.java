class Solution {
    public int maxDigitRange(int[] nums) {
        
        // int[] largest = new int[nums.length];
        // int[] smallest = new int[nums.length];
        int[] range = new int[nums.length];
        
        int maxDigit = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            int num = nums[i];

            while(num > 0){

                if(min > (num % 10)){
                    min = num % 10;
                }

                if(max < num % 10){
                    max = num % 10;
                }

                num = num / 10;
            } 
         
            range[i] = max - min;
            maxDigit = (max - min > maxDigit) ? max - min : maxDigit;
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++){

            if(range[i] == maxDigit){
                sum += nums[i];
            }
        }
        return sum;
    }
}