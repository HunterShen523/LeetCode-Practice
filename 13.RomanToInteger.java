class Solution {
    public int romanToInt(String s) {

        int ans=0;

        while (s.length()>=1 && s.substring(0,1).equals("M")) {
            s=s.substring(1);
            ans += 1000;
        }

        while (s.length()>=2 && s.substring(0,2).equals("CM")) {
            s=s.substring(2);
            ans += 900;
        }

        while (s.length()>=1 && s.substring(0,1).equals("D")) {
            s=s.substring(1);
            ans += 500;
        }

        while (s.length()>=2 && s.substring(0,2).equals("CD")) {
            s=s.substring(2);
            ans += 400;
        }

        while (s.length()>=1 && s.substring(0,1).equals("C")) {
            s=s.substring(1);
            ans += 100;
        }

        while (s.length()>=2 && s.substring(0,2).equals("XC")) {
            s=s.substring(2);
            ans += 90;
        }

        while (s.length()>=1 && s.substring(0,1).equals("L")) {
            s=s.substring(1);
            ans += 50;
        }

        while (s.length()>=2 && s.substring(0,2).equals("XL")) {
            s=s.substring(2);
            ans += 40;
        }

        while (s.length()>=1 && s.substring(0,1).equals("X")) {
            s=s.substring(1);
            ans += 10;
        }

        while (s.length()>=2 && s.substring(0,2).equals("IX")) {
            s=s.substring(2);
            ans += 9;
        }

        while (s.length()>=1 && s.substring(0,1).equals("V")) {
            s=s.substring(1);
            ans += 5;
        }

        while (s.length()>=2 && s.substring(0,2).equals("IV")) {
            s=s.substring(2);
            ans += 4;
        }

        while (s.length()>=1 && s.substring(0,1).equals("I")) {
            s=s.substring(1);
            ans += 1;
        }

        return ans;
    }
}