package task2;

import java.util.*;

public class Calculator {
    public Double calculate(String s) {
        List<String> expression = new ParserToList().parse(s);
        List<String> polishNotationExpression =
                new ReversePolishNotationConverter().convertFromInfixNotation(expression);
        Operator operator = new Operator();
        Stack<Double> stack = new Stack<>();
        try {
            for (String term:
                    polishNotationExpression) {
                if (ReversePolishNotationConverter.isNumeric(term)) stack.push(Double.parseDouble(term));
                else {
                    if (term.equals("u+") || term.equals("u-")) {
                        stack.push(operator.doingUnaryOperation(stack.pop(), term));
                    }
                    else stack.push(operator.doingBinaryOperation(stack.pop(), stack.pop(), term));
                }
            }
        }
        catch (EmptyStackException e) {
            throw new IncorrectExpressionException("Expression is incorrect");
        }
        return stack.peek();
    }
}
