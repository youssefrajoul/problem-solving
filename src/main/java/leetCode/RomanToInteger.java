package leetCode;
import static java.util.Map.entry;
import java.util.*;

public class RomanToInteger {
        public int romanToInt(String s) {
            Map<String, Integer> romanNums = Map.ofEntries(
                    entry("I", 1),
                    entry("IV", 4),
                    entry("V", 5),
                    entry("IX", 9),
                    entry("X", 10),
                    entry("XL", 40),
                    entry("L", 50),
                    entry("XC", 90),
                    entry("C", 100),
                    entry("CD", 400),
                    entry("D", 500),
                    entry("CM", 900),
                    entry("M", 1000)
            );
            int total = 0;
            for(int i = 0; i < s.length(); ++i){
                String currentChar = Character.toString(s.charAt(i));
                if((i + 1) != s.length()) {
                    String nextChar = Character.toString(s.charAt(i+1));
                    if(currentChar == "I"){
                        if(nextChar == "V") currentChar = "IV";
                        if(nextChar == "X") currentChar = "IX";
                    }
                    if(currentChar == "X"){
                        if(nextChar == "L") currentChar = "XL";
                        if(nextChar == "C") currentChar = "XC";
                    }
                    if(currentChar == "C"){
                        if(nextChar == "D") currentChar = "CD";
                        if(nextChar == "M") currentChar = "CM";
                    }
                }
                total = total + romanNums.get(currentChar);
            }
            return total;
        }
    }

