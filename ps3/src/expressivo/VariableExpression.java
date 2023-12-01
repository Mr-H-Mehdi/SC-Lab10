package expressivo;

/**
 * Represents a variable expression in the form of a variable name.
 * This class implements the Expression interface and represents
 * an immutable variable expression.
 */
public class VariableExpression implements Expression {
    // The variable name of the expression
    private final String variable;

    /**
     * Constructs a VariableExpression with the specified variable name.
     *
     * @param variable the variable name of the expression
     */
    public VariableExpression(String variable) {
        this.variable = variable;
    }

    /**
     * Returns a string representation of the variable expression.
     *
     * @return a string representation of the variable expression
     */
    @Override
    public String toString() {
        return variable;
    }

    /**
     * Checks if the variable expression is equal to another object.
     * Two VariableExpressions are considered equal if they have the same variable name.
     *
     * @param thatObject the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        VariableExpression that = (VariableExpression) thatObject;
        return variable.equals(that.variable);
    }

    /**
     * Computes a hash code for the variable expression.
     *
     * @return the hash code value for the variable expression
     */
    @Override
    public int hashCode() {
        return variable.hashCode();
    }
}
