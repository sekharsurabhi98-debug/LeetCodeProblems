class Solution {
    public int minQueenMoves(int[] source, int[] target) {

     
        if(source[0] == target[0] && source[1] == target[1]) return 0;
        System.out.println(isDaigonal(source, target));
        if(isDaigonal(source, target) || sameColumn(source, target) || sameRow(source,target)) return 1;
        
        return 2;
    }

    public static boolean isDaigonal(int[] source, int[] target){

        //source is UP
        //decrement row increment column to match target

        int sr = source[0];
        int sc = source[1];

        while(sr >= 1 && sc <= 8){
            if(sr == target[0] && sc == target[1]) return true;
            sr--;
            sc++;
        }
        //from bottom
        //increment row and decrement col
        sr = source[0];
        sc = source[1];

        while(sr <= 8 && sc >= 1){
            if(sr == target[0] && sc == target[1]) return true;
            sr++;
            sc--;
        }

        //reverse direction check 

        sr = source[0];
        sc = source[1];
        while(sr <= 8 && sc <= 8){
            if(sr == target[0] && sc == target[1])return true;
            //System.out.println("sr: "+sr+"target[0]: "+target[0]+" sc: "+sc+"tc : "+ target[1]);
            sr++;
            sc++;
        }

        sr = source[0];
        sc = source[1];
        while(sr >= 1 && sc >= 1){
            if(sr == target[0] && sc == target[1])return true;
            sr--;
            sc--;
        }
        return false;
    }


    public static boolean sameColumn(int[] source, int[] target){

        int sri = source[0], src = source[1], tri = target[0], trc = target[1];

        if(src == trc) return true;
        return false;
    }

    public static boolean sameRow(int[] source, int[] target){

        int sri = source[0], src = source[1], tri = target[0], trc = target[1];

        if(sri == tri) return true;
        return false;
    }
    
}