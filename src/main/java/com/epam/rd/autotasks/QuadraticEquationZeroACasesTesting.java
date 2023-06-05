package com.epam.rd.autotasks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a;
    private final double b;
    private final double c;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(
                new Object[]{0, 2, 3},
                new Object[]{0, 3, 4},
                new Object[]{0, 4, 5},
                new Object[]{0, 5, 6}
        );
    }

    @Test
    public void testZeroA() {
        exception.expect(IllegalArgumentException.class);
        quadraticEquation.solve(a, b, c);
    }
}

