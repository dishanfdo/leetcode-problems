package com.dishan.leetcode.problems

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SquaresOfSortedArrayTest {

    @Test
    fun testBasic() {
        val result = SquaresOfSortedArray().solve(nums = intArrayOf(-4, -1, 0, 3, 10))
        assertContentEquals(intArrayOf(0, 1, 9, 16, 100), result)
    }

    @Test
    fun testOnlyPositives() {
        val result = SquaresOfSortedArray().solve(nums = intArrayOf(0, 3, 10))
        assertContentEquals(intArrayOf(0, 9, 100), result)
    }

    @Test
    fun testOnlyNegatives() {
        val result = SquaresOfSortedArray().solve(nums = intArrayOf(-4, -1))
        assertContentEquals(intArrayOf(1, 16), result)
    }
}