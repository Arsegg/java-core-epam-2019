package com.github.arsegg.java_core_epam_2019;

public class QuadraticEquation {
    private float a;
    private float b;
    private float c;
    private Discriminant discriminant;
    private Root roots;

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

    private boolean hasTwoDistinctRoots() {
        return discriminant.discriminant > 0;
    }

    private boolean hasDoubleRoot() {
        return discriminant.discriminant == 0;
    }

    public void resolve() {
        discriminant = new Discriminant();
        System.out.println(discriminant);

        roots = new Root();
        System.out.println(roots);
    }

    private class Discriminant {
        private float discriminant;

        private Discriminant() {
            discriminant = b * b - 4 * a * c;
        }

        private float sqrt() {
            return (float) Math.sqrt(discriminant);
        }

        @Override
        public String toString() {
            return "D = " + discriminant;
        }
    }

    private class Root {
        private Float root1;
        private Float root2;

        private Root() {
            if (hasTwoDistinctRoots()) {
                root1 = (-b + discriminant.sqrt()) / (2 * a);
                root2 = (-b - discriminant.sqrt()) / (2 * a);
            } else if (hasDoubleRoot()) {
                root1 = -b / (2 * a);
            }
        }

        @Override
        public String toString() {
            if (root1 == null) {
                return "No real roots.";
            }

            if (root2 == null) {
                return "x = " + root1;
            }

            return "x1 = " + root1 +
                    ", x2 = " + root2;
        }
    }
}
