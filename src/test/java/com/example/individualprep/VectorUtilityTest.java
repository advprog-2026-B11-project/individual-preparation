package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {
    VectorUtility vectorUtility = new VectorUtility();

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
