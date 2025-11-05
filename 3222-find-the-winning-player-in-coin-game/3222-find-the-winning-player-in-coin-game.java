class Solution {
    public String winningPlayer(int x, int y) {
        int amount = 115;
        int t = 1;
        while(x >= 1 && y >= 4){
            x--;
            y -= 4;
            t++;
        }
        if(t % 2 == 0) return "Alice";
        return "Bob";
    }
}