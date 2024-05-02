package com.in28minutes.junit;

import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


class MyMathTest {
    MyMath myMath = new MyMath();

    /**
     * @BeforeAll and @Afterall methods needs to be static
     */
    @BeforeAll
    static void beforeAllMethod() {
        System.out.println("Before All Methods");
    }

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("Before Each method");
    }


    @Test
    void test1() {
        Integer[] input = new Integer[]{1, 2, 3};
        Optional<Integer> result = myMath.calculateSum(input);
        Optional<Integer> expectedResult = Optional.of(6);
        assertEquals(expectedResult, result);
    }

    @Test
    void test2() {
        Integer[] input = new Integer[]{};
        Optional<Integer> result = myMath.calculateSum(input);
        Optional<Integer> expectedResult = Optional.empty();
        assertEquals(expectedResult, result);
        //assertTrue
        //assertFalse
        //assertArrayEquals
    }

    @Test
    void test3() {
        Integer[] input = new Integer[]{1, -1};
        Optional<Integer> result = myMath.calculateSum(input);
        Optional<Integer> expectedResult = Optional.of(0);
        assertEquals(expectedResult, result);
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("After Each method");
    }

    @AfterAll
    static void afterAllMethod() {
        System.out.println("After All Methods");
    }

}
