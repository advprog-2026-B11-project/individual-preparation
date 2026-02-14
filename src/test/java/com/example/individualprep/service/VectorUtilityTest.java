package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {
    @Test
    void multiply_shouldMultiplyEachElementByScalar() {
        VectorUtility util = new VectorUtility();

        double[] v1 = {1.0, -2.0, 3.5};
        int x = 2;

        double[] result = util.multiply(v1, x);
        assertArrayEquals(new double[]{2.0, -4.0, 7.0}, result, 1e-9);
    }

    @Test
    void multiply_nullVector_shouldThrow() {
        VectorUtility util = new VectorUtility();
        assertThrows(IllegalArgumentException.class, () -> util.multiply(null, 3));
      
    @Test
    void testDotProductDifferentLength_ThrowsException() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });

        assertEquals("Vectors must have the same length", exception.getMessage());
    }

    @Test
    void testDotProduct_Successful() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] v1 = {1.0, 2.0};
        double[] v2 = {4.0, 3.0};

        assertEquals(10.0, vectorUtility.dotProduct(v1, v2));
    }
}