import java.util.*;

public class draft {

    public static void main(String[] args) {
        String s = "babad";

        int len = 0;
        String ans = "";
        for (int i = 0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                if ( isPalindrome( s.substring(i,j) ) && (j-i)>len ){
                    len = j-i;
                    ans = s.substring(i,j);
                } else {
                    break;
                }
            }
    
        }

        System.out.println(ans);
        System.out.println(len);
    }

    public static boolean isPalindrome(String s) {
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
