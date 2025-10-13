class Solution {
    public static boolean isAnagrams(String s1, String s2){

        char[] ar = s1.toCharArray();
        char[] ar1 = s2.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar1);
        s1 = String.valueOf(ar);
        s2 = String.valueOf(ar1);
        if(s1.equals(s2))
           return true;
        return false;
    }
    public List<String> removeAnagrams(String[] strs) {
        List<String> list = new ArrayList<>();
        list.add(strs[0]);
        for(int i = 1; i < strs.length; i++){
            if(!isAnagrams(strs[i-1],strs[i]))
                list.add(strs[i]);     
        }
        return list;
    }
}