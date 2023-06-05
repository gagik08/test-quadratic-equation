package com.epam.rd.autotasks.paramcareless.singlerootonly;

import com.epam.rd.autotasks.QuadraticEquationTwoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {

    public ParamCarelessSingleRootOnlyQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final double expected1, final double expected2) {
        super(a, b, c, expected1,expected2);
        ParamCarelessSingleRootOnlyQuadraticEquation quadraticEquation = new ParamCarelessSingleRootOnlyQuadraticEquation();
    }
}
