package com.ohmp.unittestcases

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    @Before
    fun setUp() {

    }

    @After
    fun tearDown() {
    }

    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }

//    @Test
//    fun test_with_zero_value() {
//        val calculator = Calculator()
//        val result = calculator.add(0, -3)
//        assertEquals(0, result)
//    }

}