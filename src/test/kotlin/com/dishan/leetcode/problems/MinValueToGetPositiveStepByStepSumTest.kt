package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MinValueToGetPositiveStepByStepSumTest {

    @Test
    fun testSample1() {
        val nums = intArrayOf(-3, 2, -3, 4, 2)
        val result = MinValueToGetPositiveStepByStepSum().solve(nums)
        assertEquals(5, result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(1, 2)
        val result = MinValueToGetPositiveStepByStepSum().solve(nums)
        assertEquals(1, result)
    }

    @Test
    fun testSample3() {
        val nums = intArrayOf(-3, 6, 2, 5, 8, 6)
        val result = MinValueToGetPositiveStepByStepSum().solve(nums)
        assertEquals(4, result)
    }
}