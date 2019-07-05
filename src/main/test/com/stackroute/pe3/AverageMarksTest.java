package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageMarksTest {
    AverageMarks averageMarks=new AverageMarks();
    @Before
    public void setUp() {
        averageMarks= new AverageMarks();
    }

    @After
    public void tearDown() {
        averageMarks = null;
    }

    public void givenInputShouldReturnBetweenZeroAndHundred()
    {
        String z=averageMarks.computeMarksEqual(20);
        assertEquals("true",z);//checking expected and actual values
    }
    @Test
    public void givenInputShouldNotReturnGreaterThanHundred()
    {
        String z=averageMarks.computeMarksGreater(121);
        assertEquals("Input should not be greater than 100",z);//checking expected and actual values
    }
    @Test
    public void givenInputShouldNotReturnLessThanZero()
    {
        String z=averageMarks.computeMarksLess(-5);
        assertEquals("Input should not be less than 0",z);//checking expected and actual values
    }

}


