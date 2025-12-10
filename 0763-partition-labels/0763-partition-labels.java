class Solution {
    public List<Integer> partitionLabels(String s) {
        int l = 0, r = s.length() - 1;
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i),i);
        while(l < s.length()){

            r = map.get(s.charAt(l));
            int diff = 0;
            for(int i = l+1; i < r; i++){
                if(map.get(s.charAt(i)) > r)
                   r = r + (map.get(s.charAt(i)) - r);
            }
            res.add(r - l + 1);
            l = r+1;
        }
        return res;
    }
}