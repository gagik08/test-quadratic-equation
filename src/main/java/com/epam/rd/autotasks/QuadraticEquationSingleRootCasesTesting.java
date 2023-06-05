package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {

    QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;
    private final double expectedRoot;

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expectedRoot) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expectedRoot = expectedRoot;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(
                new Object[]{1, -2, 1, 1},
                new Object[]{2, -4, 2, 1},
                new Object[]{3, -6, 3, 1},
                new Object[]{4, -8, 4, 1}
        );
    }

    @Test
    public void testSingleRoot() {
        assertEquals(String.valueOf(expectedRoot), quadraticEquation.solve(a, b, c));
    }
}
