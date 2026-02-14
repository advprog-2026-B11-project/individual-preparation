package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {
    @Test
    void testSubtract() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(1.0, util.subtract(3.5, 2.5));
        assertEquals(-2.5, util.subtract(2.5, 5));
    }
}
