package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaximumAverageSubarray1Test {

    @Test
    fun testSingletonArray() {
        val nums = intArrayOf(5)
        val k = 1
        val result = MaximumAverageSubarray1.solve(nums, k)
        assertEquals(5.0, result, .00001)
    }

    @Test
    fun testBasic() {
        val nums = intArrayOf(1, 12, -5, -6, 50, 3)
        val k = 4
        val result = MaximumAverageSubarray1.solve(nums, k)
        assertEquals(12.75, result, .00001)
    }
}