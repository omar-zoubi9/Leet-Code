package Easy;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(sol(s));
    }

    static int sol(String s) {
        Integer ans=0,last=0,current=0;

        HashMap<Character, Integer> romanToInt = new HashMap<Character, Integer>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        for(int i=0 ; i < s.length() ; i++) {
            current = romanToInt.get(s.charAt(i));
            if (current > last)
                ans -= last * 2;

            ans += current;
            last = current;
        }

        return ans;
        }
}
