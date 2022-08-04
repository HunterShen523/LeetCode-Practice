class Solution {
    public boolean isMatch(String s, String p) {
        char charTmp;
        
        // record number of '*', to avoid infinite searching
        int hashNum=0;
        for (int i=0; i<p.length(); i++){
            if(p.charAt(i)=='*') hashNum++;
        }

        // initial case
        if (s.length()==0) {
            if (p.length()>0 && p.charAt(p.length()-1)=='*') 
                return isMatch(s,p.substring(0,p.length()-2));
            else 
                return p.length()==0;
        }
        // s.length()!=0 but p.length()==0, return false!
        else if (p.length()==0){
            return false;
        }
        // . case
        else if (p.charAt(p.length()-1)=='.'){
            return isMatch(s.substring(0,s.length()-1) , p.substring(0,p.length()-1));
        }
        // * case
        else if (p.charAt(p.length()-1)=='*'){
            charTmp = p.charAt(p.length()-2);
            p = p.substring(0,p.length()-2);

            while ( s.length() >= p.length()-2*hashNum ){
                if ( isMatch(s, p) ) {
                    return true;
                } else {
                    p = p + charTmp;
                }
            }
            return false;
        }
        // normal case
        else {
            if (s.charAt(s.length()-1)==p.charAt(p.length()-1)) {
                return isMatch(s.substring(0,s.length()-1) , p.substring(0,p.length()-1));
            }
        }
        // never reach, place holder
        return false;
    }

}