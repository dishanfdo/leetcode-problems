package com.dishan.leetcode.problems

import kotlin.math.max

class LongestSubstringWithoutRepeatingCharacters {
    fun solve(s: String): Int {
        val window = mutableMapOf<Char, Int>()

        var left = 0
        var maxLength = 0

        for (right in s.indices) {
            val c = s[right]
            window[c] = window.getOrDefault(c, 0) + 1

            while ((window[c] ?: 0) > 1) {
                val c1 = s[left]
                window[c1] = window.getOrDefault(c1, 0) - 1
                left++
            }

            maxLength = max(maxLength, right - left + 1)
        }

        return maxLength
    }
}