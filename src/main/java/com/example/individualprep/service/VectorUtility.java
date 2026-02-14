package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vector lengths must be equal");
        }

        double[] result = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vector lengths must be same!");
        }
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] - v2[i];
        }
        return result;
    }

    public double[] multiply(double[] v1, int x) {
        if (v1 == null) {
            throw new IllegalArgumentException("v1 must not be null");
        }

        double[] result = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * x;
        }

        return result;
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        double result = 0;
        for (int i=0; i<v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }
    
    public double norm(double[] v1) {
        if (v1 == null) return 0.0;
        double sum = 0.0;
        for (double val : v1) {
            sum += val * val;
        }
        return Math.sqrt(sum);
    }
}