class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int res[] = new int[spells.length];
        Arrays.sort(potions);
        int i = 0;
        for(int spell : spells){
           int j = 0;
           while(j < potions.length){
            if((long)spell * potions[j] >= success)
                  break;
            j++;
           }
           res[i++] = potions.length - j;
        }


        return res;
    }
}