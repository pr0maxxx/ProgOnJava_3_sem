package ru.maksim.ikbo2021.new_pracs.prac_22.ex_1;

import java.util.Stack;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) throws EmptyStackException {
        try {
            System.out.println(fromPolandToNormal("2.3 5 +"));
            System.out.println(fromPolandToNormal("2 3 * 4 5 * +"));
            System.out.println(fromPolandToNormal("2 3 4 5 6 * + - /"));
            System.out.println(fromPolandToNormal("2 0 /"));
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
        }

    }

    public static double fromPolandToNormal(String stPolandInput) throws EmptyStackException, DivisionByZeroException {
        Double result = 0.0D;
        String currentPosition = "";
        Stack<Double> currentStack = new Stack();

        for(int i = 0; i < stPolandInput.length(); ++i) {
            if (isOperand(Character.valueOf(stPolandInput.charAt(i)).toString())) {
                if (currentStack.size() < 2) {
                    throw new EmptyStackException();
                }

                result = operationResult((Double)currentStack.pop(), (Double)currentStack.pop(), Character.valueOf(stPolandInput.charAt(i)).toString());
                currentStack.push(result);
            } else if (stPolandInput.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")) {
                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            } else {
                currentPosition = currentPosition + stPolandInput.charAt(i);
            }
        }

        return currentStack.empty() ? 0.0D : (Double)currentStack.pop();
    }

    public static boolean isOperand(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static Double operationResult(Double firstNum, Double secondNum, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && firstNum == 0.0D) {
            throw new DivisionByZeroException();
        } else {
            byte var4 = -1;
            switch(operand.hashCode()) {
                case 42:
                    if (operand.equals("*")) {
                        var4 = 2;
                    }
                    break;
                case 43:
                    if (operand.equals("+")) {
                        var4 = 0;
                    }
                case 44:
                case 46:
                default:
                    break;
                case 45:
                    if (operand.equals("-")) {
                        var4 = 1;
                    }
                    break;
                case 47:
                    if (operand.equals("/")) {
                        var4 = 3;
                    }
            }

            switch(var4) {
                case 0:
                    return firstNum + secondNum;
                case 1:
                    return secondNum - firstNum;
                case 2:
                    return firstNum * secondNum;
                case 3:
                    return secondNum / firstNum;
                default:
                    return 0.0D;
            }
        }
    }
}
