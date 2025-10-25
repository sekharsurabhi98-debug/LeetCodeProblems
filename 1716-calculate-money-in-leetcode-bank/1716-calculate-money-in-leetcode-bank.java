class Solution {
    public int totalMoney(int n) {
        int money = 0;
        int mondayMoney = 0;
        int prev = 0;
        for(int day = 0; day < n; day++){
            if(day % 7 == 0){
                mondayMoney++;
                money += mondayMoney;
                prev = mondayMoney;
                continue;
            }
            prev++;
            money += prev;
        }
        return money;
    }
}