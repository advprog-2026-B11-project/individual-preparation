package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticUtilityTest {
    @Test
    void testSubtract() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(1.0, util.subtract(3.5, 2.5));
        assertEquals(-2.5, util.subtract(2.5, 5));
    }
  
    @Test
    void multiply_shouldreturnProduct() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(12.0, util.multiply(3.0, 4.0), 1e-9);
        assertEquals(-6.0, util.multiply(2.0, -3.0), 1e-9);
    }
}
