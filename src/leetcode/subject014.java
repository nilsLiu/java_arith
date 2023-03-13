package leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class subject014 {

    public static void main(String[] args) {
        String[] strs = new String[]{"abs", "saa", "asasas"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 依次遍历字符串数组中的每个字符串，对于每个遍历到的字符串，更新最长公共前缀，当遍历完所有的字符串以后，即可得到字符串数组中的最长公共前缀。
     * 如果在尚未遍历完所有的字符串时，最长公共前缀已经是空串。
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }

        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //取两个String的共同前缀
            temp = minStr(temp, strs[i]);
            if (temp.length() == 0){
                return "";
            }
        }
        return temp;
    }

    private static String minStr(String s1, String s2) {
        int count = Math.min(s1.length(),s2.length());
        int index = 0;
        while (index < count && s1.charAt(index) == s2.charAt(index)){
            index++;
        }
        return s1.substring(0,index);
    }
}
