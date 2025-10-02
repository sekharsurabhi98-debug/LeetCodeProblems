class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while(numBottles > 0){
            result += numBottles / numExchange;
            if(numBottles / numExchange == 0)
                break;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return result;
    }
}