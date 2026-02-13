package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {
    VectorUtility vectorUtility = new VectorUtility();


    @Test
    void testSubtractSuccess() {
        double[] vector1 = {5.0, 10.0, 15.0};
        double[] vector2 = {2.0, 4.0, 6.0};
        double[] expected = {3.0, 6.0, 9.0};

        double[] result = vectorUtility.subtract(vector1, vector2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSubtractWithNegatives() {
        double[] vector1 = {-1.0, 5.0};
        double[] vector2 = {2.0, -3.0};
        double[] expected = {-3.0, 8.0}; // -1 - 2 = -3, 5 - (-3) = 8

        double[] result = vectorUtility.subtract(vector1, vector2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSubtractDifferentLengths() {
        double[] vector1 = {1.0, 2.0};
        double[] vector2 = {1.0, 2.0, 3.0};

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.subtract(vector1, vector2);
        });

        String expectedMessage = "Vector lengths must be same!";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
  
    @Test
    void testAdd_Success() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {3.0, 4.0};
        double[] expected = {4.0, 6.0};
        double[] result = vectorUtility.add(v1, v2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testAdd_DifferentLength_ThrowsException() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.add(v1, v2);
        });
    }
}
