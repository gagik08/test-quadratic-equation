package com.epam.rd.autotasks.paramcareful.tworootsreversed;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationZeroACasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {
    public ParamCarefulTwoRootsReversedOrderQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        QuadraticEquation quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }
}
