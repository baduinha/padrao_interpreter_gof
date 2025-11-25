public class DivideExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public DivideExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        double divisor = right.interpret();
        if (divisor == 0) throw new ArithmeticException("Divisão por zero");
        return left.interpret() / divisor;
    }
}
