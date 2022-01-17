package com.willow.questions;

import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void test1_1() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring1("babad"));
    }

    @Test
    public void test1_2() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring1("cbbd"));
    }

    @Test
    public void test1_3() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring1("a"));
    }

    @Test
    public void test1_4() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring1("ac"));
    }
}

class LongestPalindromicSubstringTest2 {
    @Test
    public void test2_1() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring2("babad"));
    }

    @Test
    public void test2_2() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring2("cbbd"));
    }

    @Test
    public void test2_3() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring2("a"));
    }

    @Test
    public void test2_4() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring2("ac"));
    }

    @Test
    public void test2_5() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring2("aacabdkacaa"));
    }
}

class LongestPalindromicSubstringTest3 {
    @Test
    public void test1() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring3("babad"));
    }

    @Test
    public void test2() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring3("cbbd"));
    }

    @Test
    public void test3() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring3("a"));
    }

    @Test
    public void test4() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring3("ac"));
    }

    @Test
    public void test5() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromicSubstring3("aacabdkacaa"));
    }
}
