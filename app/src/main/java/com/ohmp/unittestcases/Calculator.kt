package com.ohmp.unittestcases

class Calculator {
    fun add(a: Int, b: Int): Int {
        return if (a > 0 && b > 0) {
            a + b
        } else {
            0
        }
    }
}