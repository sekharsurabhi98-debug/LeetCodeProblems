class Solution {
    public boolean check(String s){
        for (char c : s.toCharArray()) {
            if (c == '+' || c == '-') return false;
        }
        return true;
    }

    public int evaluate(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.trim().split("\\s+"); // split by spaces

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                if (token.equals("+")) stack.push(op2 + op1);
                else stack.push(op2 - op1);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public int calculate(String s) {
        HashMap<Character, Integer> outStack = new HashMap<>();
        HashMap<Character, Integer> inStack = new HashMap<>();
        outStack.put('+', 1);
        outStack.put('-', 1);
        outStack.put('(', 7);
        outStack.put(')', 0);
        inStack.put('+', 2);
        inStack.put('-', 2);
        inStack.put('(', 0);

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        s = s.replaceAll(" ", "");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Handle unary minus
            if (c == '-' && (i == 0 || s.charAt(i - 1) == '(' || s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-')) {
                postfix.append("0 ");
            }

            // Handle multi-digit numbers
            if (Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num.append(s.charAt(i));
                    i++;
                }
                i--; // adjust for outer loop
                postfix.append(num).append(" ");
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else {
                if (stack.empty()) {
                    stack.push(c);
                } else if (outStack.get(c) > inStack.get(stack.peek())) {
                    stack.push(c);
                } else {
                    while (!stack.empty() && outStack.get(c) <= inStack.get(stack.peek())) {
                        postfix.append(stack.pop()).append(" ");
                    }
                    stack.push(c);
                }
            }
        }

        while (!stack.empty()) {
            postfix.append(stack.pop()).append(" ");
        }

        String postfixExpr = postfix.toString().trim();
        System.out.println("Postfix: " + postfixExpr);

        if (check(postfixExpr)) return Integer.parseInt(postfixExpr);
        return evaluate(postfixExpr);
    }
}
