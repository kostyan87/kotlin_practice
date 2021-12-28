package task2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotationConverter {
    public List<String> convertFromInfixNotation(List<String> expression) {
        List<String> result = new ArrayList<>();
        PriorityOfOperations priority = new PriorityOfOperations();
        Stack<String> stack = new Stack<>();
        if (expression.get(0).equals("+") || expression.get(0).equals("-")) {
            stack.push("u" + expression.get(0));
            expression = expression.subList(1, expression.size());
        }
        try {
            for (String c:
                    expression) {
                if (isNumeric(c)) result.add(c);
                else if (c.equals("(")) stack.push(c);
                else if ((c.equals("+") || c.equals("-")) &&
                        (!isNumeric(expression.get(expression.indexOf(c) - 1)))) {
                    stack.push("u" + c);
                }
                else if (c.equals(")")) {
                    while (!stack.peek().equals("(")) result.add(stack.pop());
                    stack.pop();
                }
                else if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^")) {
                    if (!stack.isEmpty()) {
                        if (!isNumeric(stack.peek()) && !stack.peek().equals("(") && !stack.peek().equals(")")) {
                            while ((stack.peek().equals("u-") || stack.peek().equals("u+")) ||
                                    (priority.getPriority(c) <= priority.getPriority(stack.peek()))) {
                                result.add(stack.pop());
                                if (stack.isEmpty()) break;
                                if (isNumeric(stack.peek()) || stack.peek().equals("(") || stack.peek().equals(")")) break;
                            }
                        }
                    }
                    stack.push(c);
                }
                else throw new IncorrectExpressionException("Incorrect symbol " + c);
            }
            while (!stack.isEmpty()) result.add(stack.pop());
        }
        catch (EmptyStackException e) {
            throw new IncorrectExpressionException("Incorrect expression");
        }
        return result;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
