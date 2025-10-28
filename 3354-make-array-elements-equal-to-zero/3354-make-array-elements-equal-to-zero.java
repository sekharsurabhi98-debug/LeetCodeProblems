class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int temp[] = new int[nums.length];
                for(int j = 0; j < nums.length; j++)
                  temp[j] = nums[j];
                //left
                int curr = i - 1;
                int move = -1;
                while(curr >= 0 && curr < nums.length){
                    if(temp[curr] == 0){
                        if(move == 1) curr++;
                        else curr--;
                        continue;
                    }
                    else{
                        temp[curr]--;
                        if(move == -1)
                           move = 1;
                        else 
                          move = -1;
                    }
                    if(move == -1) curr--;
                    else curr++;
                }
                boolean found = true;
                for(int val:temp){
                    if(val != 0){
                        found = false;
                        break;
                    }
                }
                if(found)
                   count++;
            }
        }
            //right
            for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int temp[] = new int[nums.length];
                for(int j = 0; j < nums.length; j++)
                  temp[j] = nums[j];
                //right
                int curr = i + 1;
                int move = 1;
                while(curr >= 0 && curr < nums.length){
                    if(temp[curr] == 0){
                        if(move == 1) curr++;
                        else curr--;
                        continue;
                    }
                    else{
                        temp[curr]--;
                        if(move == -1)
                           move = 1;
                        else 
                          move = -1;
                    }
                    if(move == -1) curr--;
                    else curr++;
                }
                boolean found = true;
                for(int val:temp){
                    if(val != 0){
                        found = false;
                        break;
                    }
                }
                if(found)
                   count++;
            }
         
        }
        return count;
    }
}