class Solution {
    public String addBinary(String a, String b) {

        // String s = "";
        // char c = '0';
        // int l = a.length() - 1;
        // int r = b.length() - 1;
        // int count = 1;
        // while(l >= 0 || r >= 0 || c == '1'){
          
      
        //BRUTE FORCE ALL CONSIDERING ALL POSSIBLE SCENARIOS
        //     if(l >= 0 && r >= 0 && a.charAt(l) == '1' && b.charAt(r) == '1' && c == '1'){
        //         s = '1' + s;
        //         c = '1';
        //     }
        //     else if(l >= 0 && r >= 0 && a.charAt(l) == '1' && b.charAt(r) == '0' && c == '1'){
        //         s = '0' + s;
        //         c = '1';
        //     }
        //     else if(l >= 0 && r >= 0 && a.charAt(l) == '1' && b.charAt(r) == '1' && c == '0'){
        //         s = '0' + s;
        //         c = '1';
        //     }
        //     else if(l >= 0 && r >= 0 && a.charAt(l) == '0' && b.charAt(r) == '1' && c == '0'){
        //         s = '1' + s;
        //         c = '0';
        //     }
        //     else if(l >= 0 && r >= 0 && a.charAt(l) == '1' && b.charAt(r) == '0' && c == '0'){
        //         s = '1' + s;
        //         c = '0';
        //     }
        //      else if(l >= 0 && r >= 0 && a.charAt(l) == '0' && b.charAt(r) == '0' && c == '0'){
        //         s = '0' + s;
        //         c = '0';
        //     }
        //     else if(l >= 0 && r >= 0 && a.charAt(l) == '0' && b.charAt(r) == '0' && c == '1'){
        //         s = '1' + s;
        //         c = '0';
        //     }

        //     else if(l >= 0 && r >= 0 && a.charAt(l) == '0' && b.charAt(r) == '1' && c == '1'){
        //         s = '0' + s;
        //         c = '1';
        //     }

        //     else if(l < 0 && r >= 0 && b.charAt(r) == '0' && c == '1'){
        //         s = '1' + s;
        //         c = '0';
        //     }

        //     else if(l < 0 && r >= 0 && b.charAt(r) == '0' && c == '0'){
        //         s = '0' + s;
        //         c = '0';
        //     }

        //      else if(l < 0 && r >= 0 && b.charAt(r) == '1' && c == '1'){
        //         s = '0' + s;
        //         c = '1';
        //     }

        //      else if(l < 0 && r >= 0 && b.charAt(r) == '1' && c == '0'){
        //         s = '1' + s;
        //         c = '0';
        //     }
        
        //     else if(l >= 0 && r < 0 && a.charAt(l) == '1' && c == '0'){
        //         s = '1' + s;
        //         c = '0';
        //     }
        //     else if(l >= 0 && r < 0 && a.charAt(l) == '1' && c == '1'){
        //         s = '0' + s;
        //         c = '1';
        //     }
        //     else if(l >= 0 && r < 0 && a.charAt(l) == '0' && c == '0'){
        //         s = '0' + s;
        //         c = '0';
        //     }
        //     else if(l >= 0 && r < 0 && a.charAt(l) == '0' && c == '1'){
        //         s = '1' + s;
        //         c = '0';
        //     }
        //     else if(l < 0 && r < 0 && c == '1'){
        //         s = '1' + s;
        //         c = '0';
        //     }
        //     System.out.println(count++);

        //     r--;
        //     l--;
        // }
        // return s;


        int l = a.length() - 1;
        int r = b.length() - 1;
        int sum = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(l >= 0 || r >= 0 || carry == 1){
            
            sum += carry;
            if(l >= 0){

                sum += a.charAt(l) - '0';
                l--;
            }

            if(r >= 0){

                sum += b.charAt(r) - '0';
                r--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
            sum = 0;
        }
        return sb.reverse().toString();
    }
} 