package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;
    private final double expectedRoot1;
    private final double expectedRoot2;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, double expectedRoot1, double expectedRoot2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expectedRoot1 = expectedRoot1;
        this.expectedRoot2 = expectedRoot2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(
                new Object[]{1, -3, 2, 2, 1},
                new Object[]{2, -7, 3, 3, 0.5},
                new Object[]{3, -10, 3, 3, 1},
                new Object[]{4, -16, 4, 2, 0.5}
        );
    }

    @Test
    public void testTwoRoots() {
        String result = quadraticEquation.solve(a, b, c);
        assertTrue(result.contains(String.valueOf(expectedRoot1)));
        assertTrue(result.contains(String.valueOf(expectedRoot2)));
    }
}



