class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char c:s.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(stack.empty())
                   return false;
                char ch = stack.peek();
                if(c == ']' && ch == '(' || c == ']' && ch == '{')
                   return false;
                else if(c == ')' && ch == '[' || c == ')' && ch == '{')
                   return false;
                else if(c == '}' && ch == '(' || c == '}' && ch == '[')
                  return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}