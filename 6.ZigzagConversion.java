class Solution {
    public String convert(String s, int numRows) {
        // no coding needed if numRows = 1
        if (numRows==1)
            return s;

        String ans="";
        String ansArray[] = new String[numRows];
        int arrayPos = 0;   // initial position is 0
        int dir = 1;    // initial direction is down
        
        // empty initial array
        for (int i=0; i<numRows; i++){
            ansArray[i]="";
        }

        // loop to fill the array
        for (int pos=0; pos<s.length(); pos++){
            ansArray[arrayPos] += s.charAt(pos);

            // direction modifier
            if (arrayPos==0){
                dir = 1;
            } else if (arrayPos == numRows-1){
                dir = -1;
            }

            // position modifier
            arrayPos += dir;
        }
        // combine the array to String
        for (String t:ansArray){
            ans+=t;
        }

        return ans;
    }
}