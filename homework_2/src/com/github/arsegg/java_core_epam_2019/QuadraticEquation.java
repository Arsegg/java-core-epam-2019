package com.github.arsegg.java_core_epam_2019;

public class QuadraticEquation {
    private float a;
    private float b;
    private float c;

    public QuadraticEquation(float a, float b, float c) {
        if (!isQuadraticEquation(a)) {
            throw new IllegalArgumentException("a can't be 0.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isQuadraticEquation(float a) {
        return a != 0;
    }

    private float calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    private boolean hasTwoDistinctRoots(float discriminant) {
        return discriminant > 0;
    }

    private boolean hasDoubleRoot(float discriminant) {
        return discriminant == 0;
    }

    private void calculateTwoDistinctRoots(float discriminant) {
        var sqrtD = Math.sqrt(discriminant);

        var x1 = (-b + sqrtD) / (2 * a);
        System.out.println("x1 = " + x1);

        var x2 = (-b - sqrtD) / (2 * a);
        System.out.println("x2 = " + x2);
    }

    private void calculateDoubleRoot(float discriminant) {
        var x = -b / (2 * a);
        System.out.println("x = " + x);
    }

    private void resolve() {
        var discriminant = calculateDiscriminant();
        System.out.println("D = " + discriminant);

        if (hasTwoDistinctRoots(discriminant)) {
            calculateTwoDistinctRoots(discriminant);
        } else if (hasDoubleRoot(discriminant)) {
            calculateDoubleRoot(discriminant);
        } else {
            System.out.println("No real roots.");
        }
    }
}
