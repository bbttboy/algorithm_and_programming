package com.willow.questions;

/**
 * 2
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 *
 * @author MrWillow
 */
public class AddTwoNumbers {

    /**
     * 时间复杂度 n
     * 空间复杂度 m+n
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode head = result;
        int temp = 0;
        while (null != l1 || null != l2 || temp != 0) {

            result.next = new ListNode();
            result = result.next;

            if (null != l1) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (null != l2) {
                temp += l2.val;
                l2 = l2.next;
            }
            result.val = temp % 10;
            temp /= 10;
        }

        return head.next;
    }
}


class ListNode {

    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}

    static ListNode addAll(int[] nums) {
        ListNode list = new ListNode();
        ListNode head = list;
        for (int i = 0; i < nums.length; i++) {
            list.next = new ListNode();
            list = list.next;
            list.val = nums[i];
        }
        return head.next;
    }
}
