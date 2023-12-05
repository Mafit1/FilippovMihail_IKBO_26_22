import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashSet;

public class RPNCalculator {

    private static final HashSet<String> ALLOWED_OPERATORS = new HashSet<String>(Arrays.asList("+", "-", "*", "/"));
    private static final double MIN_NUMBER = -Double.MAX_VALUE;
    private static final double MAX_NUMBER = Double.MAX_VALUE;

    public static String calculate(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return "Empty expressions are not allowed";
        }

        Stack<Double> stack = new Stack<>();
        int operationCount = 0;

        for (String token : tokens) {
            if (isNumber(token)) {
                double value = Double.parseDouble(token);
                if (value < MIN_NUMBER || value > MAX_NUMBER) {
                    return "Number out of range: " + value;
                }
                stack.push(value);
            } else {
                if (stack.size() < 2) {
                    return "Not enough operands for the operation: " + token;
                }

                if (!ALLOWED_OPERATORS.contains(token)) {
                    return "Invalid operator: " + token;
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                if (token.equals("/") && operand2 == 0) {
                    return "Can't divide by zero";
                }

                double result = performOperation(token, operand1, operand2);
                stack.push(result);
                operationCount++;
            }
        }

        if (stack.size() != 1 || stack.size() - 1 > operationCount) {
            return "Invalid expression: more operands than operations";
        }

        return String.valueOf(stack.pop());
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": return operand1 / operand2;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


}
