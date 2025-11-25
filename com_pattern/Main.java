public class Main {

    public static void main(String[] args) {
        String expr = "3 + 4 - 2 + 10";

        Expression interpreter = Parser.parse(expr);

        System.out.println(expr + " = " + interpreter.interpret());
    }
}
