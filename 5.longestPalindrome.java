class Solution {
    public String longestPalindrome(String s) {
            int len = 0;
            String ans = "";
        for (int i = 0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                if ( (j-i)>len && isPalindrome( s.substring(i,j) ) ){
                    len = j-i;
                    ans = s.substring(i,j);
                }
            }
        }

        return ans;
    }

    public boolean isPalindrome(String s){
        int ptr1 = 0;
        int ptr2 = s.length()-1;

        while (ptr2>ptr1) {
            if (s.charAt(ptr2)!=s.charAt(ptr1))
                return false;
            else{
                ptr1++;
                ptr2--;
            }

        }
        return true;
    }

}
