package com.willow.questions;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void test1() {
        int[] nums = new int[]{3,3};
        int target = 6;
        for (int num:twoSum.twoSum1(nums, target)) {
            System.out.println(num);
        }
    }
}
