package com.ohmp.unittestcases

class NegativeNumberValidator {
    fun isNumberNegative(number: Int): Boolean {

        return (number > 0).not()
    }
}