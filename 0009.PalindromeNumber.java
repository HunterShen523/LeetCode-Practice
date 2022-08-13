class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
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