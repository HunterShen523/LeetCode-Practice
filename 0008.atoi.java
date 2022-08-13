class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int inttemp;
        String stemp = s;
        Boolean sign = true;

        // when input is null, return 0
        if (s.length()==0) return 0;

        // ignore any leading whitespace
        while (stemp.charAt(0) == ' ') {
            stemp = stemp.substring(1);
            if (stemp.length()==0) return 0;
        }

        // check sign
        if (stemp.charAt(0)=='+'){
            stemp = stemp.substring(1);
        }else if (stemp.charAt(0)=='-') {
            stemp = stemp.substring(1);
            sign = false;
        }

        // return 0 if string starts with 0
        if (stemp.length()==0) return 0;
        
        // reading number - read until first char
        for (int i=0; i<stemp.length(); i++){
            // break when char is reached
            if (!Character.isDigit(stemp.charAt(i))) 
                break;
            // doing adding
            inttemp = Character.getNumericValue(stemp.charAt(i));

            if ( ans > (Integer.MAX_VALUE-inttemp)/10 )
                return sign? Integer.MAX_VALUE:Integer.MIN_VALUE;
            else{
               ans = ans*10 + inttemp;
            }
        }

        return sign? ans:-ans;
    }
}