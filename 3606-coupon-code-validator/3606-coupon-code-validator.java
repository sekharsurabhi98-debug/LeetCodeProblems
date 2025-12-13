class Solution {
  
   public int getPriority(String s){

    if(s.equals("electronics")) return 0;
    else if(s.equals("grocery")) return 1;
    else if(s.equals("pharmacy")) return 2;
    else if(s.equals("restaurant")) return 3;
    else return -1;
   }
   
   public boolean isValid(String s){
    if(s.isEmpty()) return false;
       for(char c:s.toCharArray()){
          if(!(c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48 && c <= 57 || c == '_'))
              return false;
       }
       return true;
   }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        int n = code.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int p1 = getPriority(businessLine[i]);
                int p2 = getPriority(businessLine[j]);
                if(p1 > p2 || (p1 == p2 && code[i].compareTo(code[j]) > 0)){

                    String temp = businessLine[i];
                    businessLine[i] = businessLine[j];
                    businessLine[j] = temp;

                    temp = code[i];
                    code[i] = code[j];
                    code[j] = temp;

                    boolean valid = isActive[i];
                    isActive[i] = isActive[j];
                    isActive[j] = valid;
                }
            }
        }

       List<String> result = new ArrayList<>();
       for(int i = 0; i < n; i++){
          
          if(isActive[i] && isValid(code[i]) && !businessLine[i].equals("invalid") && getPriority(businessLine[i]) != -1){

               result.add(code[i]);
          }
       }
       return result;
    }
}
