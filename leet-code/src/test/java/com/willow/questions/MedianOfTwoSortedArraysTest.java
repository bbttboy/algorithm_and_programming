package com.willow.questions;

import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();

    @Test
    public void test_1_1() {
        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2};
        System.out.println(median.findMedianSortedArrays_1(nums1, nums2));
    }

    @Test
    public void test_1_2() {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        System.out.println(median.findMedianSortedArrays_1(nums1, nums2));
    }

    @Test
    public void test_1_3() {
        int[] nums1 = new int[] {0,0};
        int[] nums2 = new int[] {0,0};
        System.out.println(median.findMedianSortedArrays_1(nums1, nums2));
    }

    @Test
    public void test_1_4() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {1};
        System.out.println(median.findMedianSortedArrays_1(nums1, nums2));
    }

    @Test
    public void test_1_5() {
        int[] nums1 = new int[] {2};
        int[] nums2 = new int[] {};
        System.out.println(median.findMedianSortedArrays_1(nums1, nums2));
    }
}
