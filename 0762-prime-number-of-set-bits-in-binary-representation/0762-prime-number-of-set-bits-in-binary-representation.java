class Solution {
    public boolean isPrime(int n){
        
        if(n == 1) return false;
        for(int i = 2; i <= n/2 ; i++){

            if(n % i == 0)
            return false;
        }
        return true;
    }
    public String getBinaryString(int n){

        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n % 2);
            n = n / 2;
        }

        return sb.reverse().toString();
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            String s = getBinaryString(i);
            int ones = 0;
            for(char c : s.toCharArray()){

                if(c == '1')
                   ones++;
            }

            if(isPrime(ones)){
                count++;
            }
        }
        return count;
    }
}