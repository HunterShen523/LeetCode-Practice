class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Len;
        int maxLen=0;

        if (s.length() > 1){
            // Length > 1, 2 ptr is allowed
            for (int i = 0; i<s.length(); i++){
                Len = 1;

                // for this i, get the length of the longest substring
                for (int j = i+1; j<s.length(); j++){
                    String sub = s.substring(i,j);
                    char chr = s.charAt(j);
                    if (sub.indexOf(chr)!=-1){
                        Len = j-i;
                        j=s.length();
                    } else {
                        Len++;
                    }
                }

                // check if this longest substring is the highest in the history
                if (Len > maxLen){
                    maxLen = Len;
                }
            }
        } else {
            // Length = 0/1, maxLen is fixed
            maxLen = s.length();
        }
        return maxLen;

    }
}