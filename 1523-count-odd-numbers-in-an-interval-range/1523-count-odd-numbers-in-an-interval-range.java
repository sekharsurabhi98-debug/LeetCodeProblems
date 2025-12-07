class Solution {
    public int countOdds(int low, int high) {
        if(low == high && low % 2 == 1) return 1;
        if(low == high) return 0;
        int diff = (high - low) - 1;
        int count = 0;
        if(low % 2 == 1) count++;
        if(high % 2 == 1) count++;
        if(count == 0) return (diff / 2) + 1;
        else if(count == 1) return count + (diff / 2);
        else return 2+(diff / 2);
    }
}