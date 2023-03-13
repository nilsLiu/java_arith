package leetcode;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class subject058 {

    public static void main(String[] args) {

        String s = "w ";
        System.out.println(lengthOfLastWord(s));
    }


    /**
     * 思路：反向遍历
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {

        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }

        int wordlength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordlength++;
            index --;
        }

        return wordlength;
    }
}
