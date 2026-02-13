package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticUtilityTest {

    @Test
    void multiply_shouldreturnProduct() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(12.0, util.multiply(3.0, 4.0), 1e-9);
        assertEquals(-6.0, util.multiply(2.0, -3.0), 1e-9);
    }
}