package leetCode;

public class LongestCommonPrefix {
    public static String longestCommonPrefixMehod(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String tempPrefix = "";
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].length() == 0) return "";
                if (prefix.charAt(0) != strs[i].charAt(0)) {
                    return "";
                }
                if (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                    tempPrefix = tempPrefix + Character.toString(strs[i].charAt(j));
                } else {
                    break;
                }

            }
            prefix = tempPrefix;
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"aaa", "aa", "aaa"};
        System.out.println(longestCommonPrefixMehod(strs));
    }
}
