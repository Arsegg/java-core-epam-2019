package com.github.arsegg.java_core_epam_2019;

import java.util.Scanner;

public class App {
    private static void resolve(final float a, final float b, final float c) {
        if (a == 0) {
            System.out.println("a can't be 0.");
            return;
        }

        final var d = b * b - 4 * a * c;

        System.out.println("D = ".concat(String.valueOf(d))); // :)
        if (d > 0) {
            final var x1 = (-b + Math.sqrt(d)) / (2 * a);
            final var x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("x1 = ".concat(String.valueOf(x1)));
            System.out.println("x2 = ".concat(String.valueOf(x2)));
        } else if (d == 0) {
            final var x = -b / (2 * a);

            System.out.println("x = ".concat(String.valueOf(x)));
        } else {
            System.out.println("No real roots");
        }
    }

    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Simple Quadratic Equation Solver.\n\n" +
                "Program finds all real roots of this kind of equations: \n" +
                "a * x ^ 2 + b * x + c = 0, where a != 0.\n"
        );

        System.out.print("a = ");
        final var a = scanner.nextFloat();
        System.out.print("b = ");
        final var b = scanner.nextFloat();
        System.out.print("c = ");
        final var c = scanner.nextFloat();

        resolve(a, b, c);
    }
}
