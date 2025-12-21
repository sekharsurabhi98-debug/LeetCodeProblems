class Solution {
    
    public String removeDigit(String s, char digit) {

        //The moment you find the char which is equal to digit d then if i+1 is gereater then that index it will always greater value return 
        // if you are not finding anything remove last digit
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == digit && s.charAt(i+1) > s.charAt(i))
                return s.substring(0,i) + s.substring(i+1);
        }

        int i = s.lastIndexOf(digit);
        System.out.println(i);
        return s.substring(0,i) + s.substring(i+1);
    }
}