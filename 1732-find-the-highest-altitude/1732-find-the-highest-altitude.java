class Solution {
    public int largestAltitude(int[] gain) {
        int prefix = 0;
        int maxAltitude = 0;
        for(int i = 0; i < gain.length; i++){
            prefix += gain[i];
            maxAltitude = Math.max(prefix, maxAltitude);
        }
        return maxAltitude;
    }
}