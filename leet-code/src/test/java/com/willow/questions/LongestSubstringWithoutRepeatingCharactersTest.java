package com.willow.questions;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test1_1 () {
        String s = "pwwkew";
        System.out.println(lswrc.lengthOfLongestSubstring(s));
    }

    @Test
    public void test1_2() {
        String s = "tmmzuxt";
        System.out.println(lswrc.lengthOfLongestSubstring(s));
    }

    @Test
    public void test2_1() {
        String s = "tmmzuxt";
        System.out.println(lswrc.lengthOfLongestSubstring1(s));
    }

    @Test
    public void test2_2() {
        String s = "pwwkew";
        System.out.println(lswrc.lengthOfLongestSubstring1(s));
    }

    @Test
    public void test2_3() {
        String s = " ";
        System.out.println(lswrc.lengthOfLongestSubstring1(s));
    }

    @Test
    public void test3_1() {
        String s = "tmmzuxt";
        System.out.println(lswrc.lengthOfLongestSubstring2(s));
    }

    @Test
    public void test3_2() {
        String s = "pwwkew";
        System.out.println(lswrc.lengthOfLongestSubstring2(s));
    }

    @Test
    public void test3_3() {
        String s = " ";
        System.out.println(lswrc.lengthOfLongestSubstring2(s));
    }
}
