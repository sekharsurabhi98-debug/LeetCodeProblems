class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack();
        int idx = -1;
        for(int i = 0; i < word.length();i++){
            st.push(word.charAt(i));
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }
        if(idx == -1)
           return word;
        String ns = "";
        while(!st.empty())
           ns = ns + st.pop();
        for(int i = idx+1; i < word.length();i++){
            ns = ns + word.charAt(i);
        }
        return ns;
    }
}