class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        String[] arr1 = startTime.split(":");
        String[] arr2 = endTime.split(":");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int ETM = Integer.parseInt(arr2[1]);
        int STM = Integer.parseInt(arr1[1]);
        int STS = Integer.parseInt(arr1[2]);
        int ETS = Integer.parseInt(arr2[2]);
        int STH = Integer.parseInt(arr1[0]);
        int ETH = Integer.parseInt(arr2[0]);

        int ETIS = (ETH * 60 * 60) + ETM * 60 + ETS;
        int STIS = (STH * 60 * 60) + STM * 60 + STS;

        System.out.println(ETIS+" : "+STIS);
        return ETIS - STIS;
    } 
}