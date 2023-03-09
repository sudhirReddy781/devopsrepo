package com.solveit;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumbersTest extends TestCase {

    Numbers numbers = new Numbers();

    public NumbersTest(String testName) {
        super(testName);
    }

    public void testNumbersAdd() {
        assertEquals(15, numbers.numberOperations(10, 5, "+"));
    }

    public void testNumbersSubstract() {
        assertEquals(10, numbers.numberOperations(15, 5, "-"));
    }

    @Test(expected = RuntimeException.class)
    public void testNumbersError() {
       assertNotEquals(10, numbers.numberOperations(10, 5, "+"));
    }
}
