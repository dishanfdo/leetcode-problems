package com.dishan.leetcode.problems

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountingElementsTest {
    @Test
    fun testSample1() {
        val nums = intArrayOf(1,2,3)
        val result = CountingElements().solve(nums)
        assertEquals(2, result)
    }

    @Test
    fun testSample2() {
        val nums = intArrayOf(1,1,3,3,5,5,7,7)
        val result = CountingElements().solve(nums)
        assertEquals(0, result)
    }
}