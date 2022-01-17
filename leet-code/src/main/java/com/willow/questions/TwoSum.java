package com.willow.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1
 * @author MrWillow
 */
public class TwoSum {

    /**
     * Map
     * 时间复杂度 n
     * 空间复杂度 n
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap(nums.length);
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
