package com.willow.questions;

/**
 * 5
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * @author MrWillow
 */
public class LongestPalindromicSubstring {

    /**
     * 暴力求解<p>
     * 时间复杂度 n^3<p>
     * 空间复杂度 n<p>
     * @param s
     * @return
     */
    public String longestPalindromicSubstring1(String s) {

        int max = 0;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome1(s, i, j) && max < j - i + 1) {
                    max = j - i + 1;
                    sb.replace(0, sb.length(), s.substring(i, j+1));
                }
            }
        }

        return sb.toString();
    }

    /**
     * 动态规划思想<p>
     * 使用二维数组实现，求解正串与倒串的最长公共子串<p>
     * 时间复杂度 n^2 <p>
     * 空间复杂度 n^2<p>
     * @param s
     * @return
     */
    public String longestPalindromicSubstring2(String s) {

        /**
         * 二维数组记录倒串和正串 中的 子串 有多少字符相同<p>
         * 这样记录的是公共子串，不一定是回文，因此需要对回文进行判定<p>
         * 还需要结合位置进行回文串判定<p>
         * 因为abcdfcba 前后的 abc 与 cba 会被判定为公共子串<p>
         * 所以需要进行判定：倒串回文的末位 是否对应 正串的首位
         */

        int max = 0;
        StringBuilder sb = new StringBuilder("");

        // 二维数组记录，初始赋值为0
        int[][] records = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                records[i][j] = 0;
            }
        }

        // 水平正串-j 垂直倒串-i
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                // s.charAt(s.length() - i - 1) 倒串下标为i的字符
                if (s.charAt(j) == s.charAt(s.length() - i - 1)) {
                    // 边界处理
                    if (i == 0 || j == 0) {
                        records[i][j] = 1;
                    } else {
                        records[i][j] = records[i - 1][j - 1] + 1;
                    }
                    // 使用大于等于 保证"ac"时输出的是a
                    if (records[i][j] >= max && isPalindrome2(s, j, i, records[i][j])){
                        max = records[i][j];
                        sb.replace(0, sb.length(), s.substring(j - max + 1, j + 1));
                    }
                }
            }
        }

        return sb.toString();
    }

    /**
     * 第二种方法的空间优化<p>
     * 分析循环可以知道，按行更新，只需要上一行的信息就可
     * @param s
     * @return
     */
    public String longestPalindromicSubstring3(String s) {

        int max = 0;
        StringBuilder sb = new StringBuilder("");

        // 降低空间消耗
        int[] records = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            records[i] = 0;
        }

        // 需要考虑records更新问题
        // 解决方法：倒序更新records
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == s.charAt(s.length() - i - 1)) {
                    if (i == 0 || j == 0) {
                        records[j] = 1;
                    } else {
                        // 对照第二种方法看
                        records[j] = records[j - 1] + 1;
                    }
                    if (records[j] >= max && isPalindrome2(s, j, i, records[j])) {
                        max = records[j];
                        sb.replace(0, sb.length(), s.substring(j - max + 1, j + 1));
                    }
                } else {
                    records[j] = 0;
                }
            }
        }
        return sb.toString();
    }

    /**
     * 暴力求解优化<p>
     * 思路：回文的特殊子串也是回文 --> abcba 的子串 bcb 或 c 都是回文 <p>
     * 如果特殊子串不是回文，那么父串也不是回文<p>
     * 使用动态规划思想，记录已经判断过的子串
     * @param s
     * @return
     */
    public String longestPalindromicSubstring4(String s) {

        // 记录判断过的子串
        boolean[][] records = new boolean[s.length()][s.length()];
        int max = 0;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome1(s, i, j)) {
                    records[i][j] = true;
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        sb.replace(0, sb.length(), s.substring(i, j+1));
                    }
                } else {
                    records[i][j] = false;
                }
            }
        }

        return sb.toString();
    }

    private boolean isPalindrome1(String s, int left, int right) {
        while (right >= left) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 通过判断回文 倒串形式的最后位置 是否对应 正串形式的首位
     * @param s
     * @param j 正串位置
     * @param i 倒串位置
     * @return
     */
    private boolean isPalindrome2(String s, int j, int i, int distance) {
        // 倒串变正后i对应的位置
        int reI = s.length() - i - 1;
        // 是否对应正串首位
        return j - distance + 1 == reI ? true : false;
    }
}
