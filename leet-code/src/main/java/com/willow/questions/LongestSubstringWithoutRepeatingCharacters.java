package com.willow.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * 3
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author MrWillow
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Map
     * 时间复杂度 n
     * 空间复杂度 n
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap(s.length());
        int start = 0;
        int len = 0;
        int count = 0;
        char chr;
        for (int i = 0; i < s.length(); i++) {
            chr = s.charAt(i);
            if (map.containsKey(chr)) {
                int preIndex = map.get(chr);
                if (preIndex >= start) {
                    len = len < count ? count : len;
                    count = i - preIndex;
                    start = preIndex + 1;
                } else {
                    count++;
                }
            } else {
                count++;
            }
            map.put(chr, i);
        }
        len = len < count ? count : len;
        return len;
    }

    /**
     * 滑动窗口思想
     * 时间复杂度 n
     * 空间复杂度 n
     * 代码更简洁, 其实就是捋清楚逻辑, 减少条件判断
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {

        Map<Character, Integer> map = new HashMap<>(s.length());
        // 左窗框 p 右窗框 i 窗口内的数据不重复(闭区间)
        int p = 0, i = 0, len = 0;

        while (i < s.length()) {

            if (map.containsKey(s.charAt(i))) {
                int preIndex = map.get(s.charAt(i));
                p = p > preIndex ? p : preIndex + 1;
            }

            len = len < i - p + 1 ? i - p + 1 : len;
            map.put(s.charAt(i), i++);
        }

        return len;
    }

    /**
     * 牛批！！！！！！！！！
     * 使用数组代替map
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        // 若无特殊字符(无汉字之类的)
        // 那么可以用ASCII字符对应
        // 数组的下标对应 Key
        int[] map = new int[128];
        int p = 0, i = 0, len = 0;

        for (int j = 0; j < map.length; j++) {
            map[j] = -1;
        }

        while (i < s.length()) {
            char chr = s.charAt(i);
            if (map[chr] != -1) {
                p = p > map[chr] ? p : map[chr] + 1;
            }

            len = len < i - p + 1 ? i - p + 1 : len;
            map[s.charAt(i)] = i++;
        }

        return len;
    }
}
