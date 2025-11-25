public class Parser {

    public static Expression parse(String input) {
        String[] tokens = input.split(" ");

        Expression current = new NumberExpression(Double.parseDouble(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double number = Double.parseDouble(tokens[i + 1]);
            Expression right = new NumberExpression(number);

            switch (operator) {
                case "+": current = new AddExpression(current, right); break;
                case "-": current = new SubtractExpression(current, right); break;
                case "*": current = new MultiplyExpression(current, right); break;
                case "/": current = new DivideExpression(current, right); break;
                default:
                    throw new RuntimeException("Operador inválido");
            }
        }

        return current;
    }
}
