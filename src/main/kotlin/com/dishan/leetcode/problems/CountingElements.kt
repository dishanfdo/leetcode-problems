package com.dishan.leetcode.problems

class CountingElements {
    fun solve(arr: IntArray): Int {
        val numberSet = arr.toSet()
        return arr.count { numberSet.contains(it + 1) }
    }
}