package com.epam.rd.autotasks.paramcareless.tworootsonly;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationTwoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {
    private final QuadraticEquation quadraticEquation;
    public ParamCarelessTwoRootsOnlyQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final double expected1, final double expected2) {
        super(a, b, c, expected1, expected2);
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }
}
