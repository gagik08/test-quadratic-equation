package com.epam.rd.autotasks.paramcareful.tworootsreversed;

import com.epam.rd.autotasks.QuadraticEquationTwoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {

    public ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final double expected1, final double expected2) {
        super(a, b, c, expected1, expected2);
        ParamCarefulTwoRootsReversedOrderQuadraticEquation quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }
}
