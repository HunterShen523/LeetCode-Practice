import java.util.*;

public class draft {

    public static void main(String[] args) {
        String s = "A";
        int numRows = 1;
        String ans = convert(s,numRows);
        System.out.println(ans);
    }

    public static String convert(String s, int numRows) {
        String ans="";
        String ansArray[] = new String[numRows];
        int arrayPos = 0;   // initial position is 0
        int dir = 1;    // initial direction is down
        
        // empty initial array
        for (int i=0; i<numRows; i++){
            ansArray[i]="";
        }


        for (int pos=0; pos<s.length(); pos++){
            ansArray[arrayPos] += s.charAt(pos);

            // direction modifier
            if (arrayPos==0){
                dir = 1;
            } else if (arrayPos == numRows-1){
                dir = -1;
            }

            arrayPos += dir;
        }

        for (String t:ansArray){
            ans+=t;
        }

        return ans;
    }
}
