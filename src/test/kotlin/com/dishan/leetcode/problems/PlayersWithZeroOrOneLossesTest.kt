package com.dishan.leetcode.problems

import kotlin.test.Test
import kotlin.test.assertContentEquals

class PlayersWithZeroOrOneLossesTest {

    @Test
    fun testSample1() {
        val matches = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 6),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
            intArrayOf(4, 5),
            intArrayOf(4, 8),
            intArrayOf(4, 9),
            intArrayOf(10, 4),
            intArrayOf(10, 9),
        )
        val result = PlayersWithZeroOrOneLosses().solve(matches)
        assertContentEquals(listOf(
            listOf(1, 2, 10),
            listOf(4, 5, 7, 8)
        ), result)
    }

    @Test
    fun testSample2() {
        val matches = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(5, 4),
            intArrayOf(6, 4)
        )
        val result = PlayersWithZeroOrOneLosses().solve(matches)
        assertContentEquals(listOf(
            listOf(1, 2, 5, 6),
            listOf()
        ), result)
    }
}