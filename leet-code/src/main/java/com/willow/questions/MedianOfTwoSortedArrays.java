package com.willow.questions;

/**
 * 4
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * @author MrWillow
 */
public class MedianOfTwoSortedArrays {

    /**
     * 双指针
     * 指针步数法 即 指针走 (m+n)/2 步
     * 时间复杂度 m+n
     * 空间复杂度 1
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays_1(int[] nums1, int[] nums2) {
        // 数组长度
        int m = nums1.length, n = nums2.length;
        // 双指针
        int p = 0, q = 0;
        // 步数 分奇偶数两种情况 可以用双位置定位
        int l = (m+n-1) / 2 + 1, r = (m+n) / 2 + 1;
        // 记录步数
        int count = 0;
        int r1 = 0,  r2 = 0;
        int result;
        while (p < nums1.length || q < nums2.length) {
            count++;
            if (p < nums1.length && (q == nums2.length || nums1[p] < nums2[q])) {
                result = nums1[p];
                p++;
            } else {
                result = nums2[q];
                q++;
            }
            r1 = count == l ? result : r1;
            r2 = count == r ? result : r2;
        }

        return (double) (r1 + r2) / 2;
    }
}
