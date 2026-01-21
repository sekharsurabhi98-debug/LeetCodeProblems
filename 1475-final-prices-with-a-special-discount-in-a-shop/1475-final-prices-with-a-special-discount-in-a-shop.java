class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = prices.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i])
                stack.pop();
            if(stack.isEmpty())
               result[i] = prices[i];
            else
               result[i] = prices[i] - prices[stack.peek()];
            stack.push(i);
        }
        return result;
    }
}