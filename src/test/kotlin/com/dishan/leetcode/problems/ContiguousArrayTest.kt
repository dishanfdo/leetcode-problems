package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContiguousArrayTest {
    @Test
    fun testSample1() {
        val nums = intArrayOf(0, 1)
        val result = ContiguousArray().solve(nums)
        assertEquals(2, result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(0, 1, 0)
        val result = ContiguousArray().solve(nums)
        assertEquals(2, result)
    }

    @Test
    fun testSample3() {
        val nums = intArrayOf(0, 0, 0, 0, 0, 0, 1, 1, 1, 0)
        val result = ContiguousArray().solve(nums)
        assertEquals(6, result)
    }
}