package com.ohmp.unittestcases

import org.junit.Test
import org.mockito.Mockito.*
import java.util.*
import kotlin.collections.ArrayList


class MockingTraining {

    @Throws(Exception::class)
    @Test
    fun test1() {
        val mockedList = mock(LinkedList::class.java)

        //stubbing

        //stubbing
        `when`(mockedList.get(0)).thenReturn("first")
        //`when`(mockedList.get(1)).thenThrow(RuntimeException())

        //following prints "first"

        //following prints "first"
        System.out.println(mockedList.get(0))

        //following throws runtime exception

        //following throws runtime exception
        System.out.println(mockedList.get(1))

        //following prints "null" because get(999) was not stubbed

        //following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999))

        //Although it is possible to verify a stubbed invocation, usually it's just redundant
        //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
        //If your code doesn't care what get(0) returns, then it should not be stubbed.

        //Although it is possible to verify a stubbed invocation, usually it's just redundant
        //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
        //If your code doesn't care what get(0) returns, then it should not be stubbed.
        verify(mockedList).get(0)
    }

  //  @Throws(Exception::class)
//    @Test
//    fun test2() {
//        //mock creation
//        //mock creation
//        val mockedList : ArrayList = mock(MutableList::class.java)
//
//        //using mock object
//
//        //using mock object
//        mockedList.add("one")
//     //   mockedList.clear()
//
//        //verification
//
//        //verification
//        verify(mockedList).add("one")
//      //  verify(mockedList).clear()
//    }

}