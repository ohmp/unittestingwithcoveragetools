package com.ohmp.unittestcases

import org.junit.Assert
import org.junit.Before
import org.junit.Test

internal class NegativeNumberValidatorTest {
     lateinit var SUT : NegativeNumberValidator
    @Before
    fun setUp() {
        SUT = NegativeNumberValidator()
    }

    @Test
    fun isNumberNegativeTest1() {
        Assert.assertEquals(SUT.isNumberNegative(2),false)
    }
    @Test
    fun isNumberNegativeTest2() {
        Assert.assertEquals(SUT.isNumberNegative(0),true)
    }

    @Test
    fun isNumberNegativeTest3() {
        Assert.assertEquals(SUT.isNumberNegative(-1),true)
    }
}