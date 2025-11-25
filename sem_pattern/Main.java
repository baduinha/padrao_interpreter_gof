public class Main {

    public static double evaluate(String expr) {
        String[] tokens = expr.trim().split(" ");

        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            double value = Double.parseDouble(tokens[i + 1]);

            switch (op) {
                case "+": result += value; break;
                case "-": result -= value; break;
                case "*": result *= value; break;
                case "/":
                    if (value == 0) throw new RuntimeException("Divisão por zero");
                    result /= value;
                    break;
                default:
                    throw new RuntimeException("Operador inválido");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(evaluate("3 + 4 - 2"));
    }
}