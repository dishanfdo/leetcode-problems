package com.dishan.leetcode.problems

class RansomNote {
    fun solve(ransomNote: String, magazine: String): Boolean {
        // A larger ransom note cannot be created from smaller magazine
        if (ransomNote.length > magazine.length) { return false }

        val magazineLetters = mutableMapOf<Char, Int>()
        for (char in magazine) {
            magazineLetters[char] = magazineLetters.getOrDefault(char, 0) + 1
        }

        for (char in ransomNote) {
            val charCount = magazineLetters[char] ?: 0
            if (charCount == 0) { return false }
            magazineLetters[char] = charCount - 1
        }

        return true
    }
}