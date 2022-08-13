class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];

        for (int i=1; i<strs.length; i++) {
           while ( str.length()>0 && !strs[i].startsWith(str) ) {
               str = str.substring(0,str.length()-1);
           }
        }

        if (str.length()==0) return "";
        else return str;
    }
}