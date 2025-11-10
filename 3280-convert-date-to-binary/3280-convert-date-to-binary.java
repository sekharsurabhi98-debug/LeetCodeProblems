class Solution {
    public String convertDateToBinary(String date) {
        String dateInBinary = "";
        String[] ar = date.split("-");
        int i = 0;
        for(String s:ar){
            int num = Integer.parseInt(s);
            if(i != ar.length - 1)
            dateInBinary += Integer.toBinaryString(num)+"-";
            else
            dateInBinary += Integer.toBinaryString(num);
            i++;
        }
        return dateInBinary;
    }
}