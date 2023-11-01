package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RunningSumOfArrayTest {

    @Test
    fun testSingletonArray() {
        val nums = intArrayOf(1)
        val result = RunningSumOfArray().solve(nums)
        assertArrayEquals(intArrayOf(1), result)
    }

    @Test
    fun testBasic() {
        val nums = intArrayOf(3, 1, 2, 10, 1)
        val result = RunningSumOfArray().solve(nums)
        assertArrayEquals(intArrayOf(3, 4, 6, 16, 17), result)
    }
}