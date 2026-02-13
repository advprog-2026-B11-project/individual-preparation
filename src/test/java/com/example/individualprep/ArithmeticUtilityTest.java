package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testDivideSuccess() {
        assertEquals(2.5, arithmeticUtility.divide(5.0, 2.0));
        assertEquals(-2.0, arithmeticUtility.divide(10.0, -5.0));
        assertEquals(0.5, arithmeticUtility.divide(1.0, 2.0));
        assertEquals(0.6521739130434783, arithmeticUtility.divide(1.5, 2.3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.divide(5.0, 0.0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
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
