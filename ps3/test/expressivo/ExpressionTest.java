/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO tests for Expression
    
    // Test for toString
    @Test
    public void testToString() {
        Expression numberExpr = new NumberExpression(42);
        Expression variableExpr = new VariableExpression("x");

        assertEquals("42.0", numberExpr.toString());
        assertEquals("x", variableExpr.toString());
    }

    // Test for equals
    @Test
    public void testEquals() {
        Expression expr1 = new NumberExpression(42);
        Expression expr2 = new NumberExpression(42);
        Expression expr3 = new VariableExpression("x");

        assertEquals(expr1, expr2);
        assertNotEquals(expr1, expr3);
    }

    // Test for hashCode
    @Test
    public void testHashCode() {
        Expression expr1 = new NumberExpression(42);
        Expression expr2 = new NumberExpression(42);
        Expression expr3 = new VariableExpression("x");

        assertEquals(expr1.hashCode(), expr2.hashCode());
        assertNotEquals(expr1.hashCode(), expr3.hashCode());
    }

    
}
