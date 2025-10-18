class Solution {
    public String defangIPaddr(String address) {
        String ns = "";
        for(char c : address.toCharArray()){
            if(c == '.')
               ns = ns + "[.]";
            else
               ns = ns + c;
        }
        return ns;
    }
}