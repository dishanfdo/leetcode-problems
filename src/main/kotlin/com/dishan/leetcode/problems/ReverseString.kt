package com.dishan.leetcode.problems

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * https://leetcode.com/explore/featured/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4592/
 */
class Solution {
    fun solve(s: CharArray) {
        var i = 0
        var j = s.size - 1
        while (i < j) {
            val c = s[i]
            s[i] = s[j]
            s[j] = c

            i++
            j--
        }
    }
}