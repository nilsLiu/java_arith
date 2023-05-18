package leetcode;

import java.util.HashMap;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 * <p>
 * 滑动窗口
 */
public class subject003 {


    //双指针
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        // 当字符串长度为零时，返回值为0
        if (len == 0) {
            return 0;
        }
        // left为滑动窗口左侧
        int left = 0;
        int max = 0;
        // 使用HashMap.containsKey检索重复字
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                //当检索到重复字段时，将窗口左侧移动
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            // 最长子串的长度为字串长度的最大值
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
