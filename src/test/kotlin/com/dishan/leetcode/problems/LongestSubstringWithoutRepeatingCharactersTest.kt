package com.dishan.leetcode.problems

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun testSample1() {
        val result = LongestSubstringWithoutRepeatingCharacters().solve("abcabcbb")
        assertEquals(result, 3)
    }

    @Test
    fun testSample2() {
        val result = LongestSubstringWithoutRepeatingCharacters().solve("bbbbb")
        assertEquals(result, 1)
    }

    @Test
    fun testSample3() {
        val result = LongestSubstringWithoutRepeatingCharacters().solve("pwwkew")
        assertEquals(result, 3)
    }

    @Test
    fun testSample4() {
        val result = LongestSubstringWithoutRepeatingCharacters().solve("tmmzuxt")
        assertEquals(result, 5)
    }
}