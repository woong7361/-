package org.example.solutions;

// https://leetcode.com/problems/contains-duplicate

import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int result = -1;
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.stream().findFirst().get();
    }
}



