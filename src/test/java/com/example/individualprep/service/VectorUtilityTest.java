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
    }
}
