public class NumberExpression implements Expression {

    private final double value;

    public NumberExpression(double value) {
        this.value = value;
    }

    @Override
    public double interpret() {
        return value;
    }
}
