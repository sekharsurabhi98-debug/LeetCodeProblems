class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1) return 1;
        int maxLength = 0;
        int c = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if(i % 2 == 0){
            if(arr[i] < arr[i+1]) 
                c++; 
            else{
                 maxLength = (maxLength > c) ? maxLength : c;
                 c = 1;
              }
            }else{
                if(arr[i] > arr[i+1])
                  c++;
                else {
                    maxLength = (maxLength > c) ? maxLength : c;
                    c = 1;
                }
            }
        }
        maxLength = (maxLength > c) ? maxLength : c;
        System.out.println(maxLength);
           c = 1;
          for(int i = 0; i < arr.length - 1; i++){
            if(i % 2 == 0){
            if(arr[i] > arr[i+1]) 
                c++; 
            else{
                 maxLength = (maxLength > c) ? maxLength : c;
                 c = 1;
              }
            }else{
                if(arr[i] < arr[i+1])
                  c++;
                else {
                    maxLength = (maxLength > c) ? maxLength : c;
                    c = 1;
                }
            }
        }
         maxLength = (maxLength > c) ? maxLength : c;
        return maxLength;
    }
}