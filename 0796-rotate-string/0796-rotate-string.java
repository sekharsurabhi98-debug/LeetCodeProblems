class Solution {
    public boolean rotateString(String s, String goal) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int count = 0;
        while(count < s.length()){
            if(sb.toString().equals(goal)){
                return true;
            }

            sb.deleteCharAt(0);
            sb.append(s.charAt(count));

            System.out.println(sb.toString());
            count++;
        }

        return false;
        
    }
}