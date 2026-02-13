package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testExponent_PositivePower() {
        // 2 pangkat 3 = 8
        double result = arithmeticUtility.exponent(2.0, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    void testExponent_ZeroPower() {
        // Angka apapun pangkat 0 = 1
        double result = arithmeticUtility.exponent(100.0, 0);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    void testExponent_NegativePower() {
        // 2 pangkat -1 = 0.5
        double result = arithmeticUtility.exponent(2.0, -1);
        assertEquals(0.5, result, 0.0001);
    }
}
