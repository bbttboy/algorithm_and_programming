package com.willow.questions;

import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test1() {
        int[] l1 = new int[]{2,4,3}, l2 = new int[]{5,6,4};
        ListNode ln = addTwoNumbers.addTwoNumbers(ListNode.addAll(l1), ListNode.addAll(l2));
        System.out.println(toString(ln));
    }

    @Test
    public void test2() {
        int[] l1 = new int[]{0}, l2 = new int[]{0};
        ListNode ln = addTwoNumbers.addTwoNumbers(ListNode.addAll(l1), ListNode.addAll(l2));
        System.out.println(toString(ln));
    }

    @Test
    public void test3() {
        int[] l1 = new int[]{9,9,9,9,9,9,9}, l2 = new int[]{9,9,9,9};
        ListNode ln = addTwoNumbers.addTwoNumbers(ListNode.addAll(l1), ListNode.addAll(l2));
        System.out.println(toString(ln));
    }

    public String toString(ListNode ln) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        while (null != ln) {
            stringBuffer.append(ln.val + ", ");
            ln = ln.next;
        }
        stringBuffer.delete(stringBuffer.length()-2,stringBuffer.length());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
