package com.github.arsegg.java_core_epam_2019;

public class App {
    private static void resolve(float a, float b, float c) {
        if (a == 0) {
            System.out.println("a can't be 0.");
            return;
        }

        var d = b * b - 4 * a * c;
        System.out.println("D = " + d);

        if (d > 0) {
            var x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);

            var x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            var x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("No real roots");
        }
    }
}
