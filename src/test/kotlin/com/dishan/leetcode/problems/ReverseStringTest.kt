package com.dishan.leetcode.problems

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReverseStringTest {
    @Test
    fun testSingleElementArray() {
        val arr = charArrayOf('a')
        Solution().solve(arr)
        assertContentEquals(charArrayOf('a'), arr)
    }

    @Test
    fun testOddLengthArray() {
        val arr = charArrayOf('a', 'b', 'c')
        Solution().solve(arr)
        assertContentEquals(charArrayOf('c', 'b', 'a'), arr)
    }

    @Test
    fun testEvenLengthArray() {
        val arr = charArrayOf('a', 'b')
        Solution().solve(arr)
        assertContentEquals(charArrayOf('b', 'a'), arr)
    }
}