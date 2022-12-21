package ru.maksim.ikbo2021.new_pracs.prac_22.ex_2;

import java.util.Stack;

public class CalculatorModel {
    private String stUserInput = "";
    private String stResult = "";

    public CalculatorModel() {
    }

    public String getUserInput() {
        return this.stUserInput;
    }

    public void setUserInput(String stUserInput) {
        this.stUserInput = stUserInput;
    }

    public String getResult() {
        return this.stResult;
    }

    public void setResult(String stResult) {
        this.stResult = stResult;
    }

    public void fromPolandToNormal() throws EmptyStackException, DivisionByZeroException, EmptyStringException, DoubleParseException {
        Double result = 0.0D;
        if (this.stUserInput.equals("")) {
            throw new EmptyStringException();
        } else {
            String currentPosition = "";
            Stack<Double> currentStack = new Stack();

            for(int i = 0; i < this.stUserInput.length(); ++i) {
                if (this.isOperand(Character.valueOf(this.stUserInput.charAt(i)).toString())) {
                    if (currentStack.size() < 2) {
                        throw new EmptyStackException();
                    }

                    result = this.operationResult((Double)currentStack.pop(), (Double)currentStack.pop(), Character.valueOf(this.stUserInput.charAt(i)).toString());
                    currentStack.push(result);
                } else if (this.stUserInput.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")) {
                    try {
                        currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                    } catch (Exception var6) {
                        throw new DoubleParseException();
                    }

                    currentPosition = "";
                } else {
                    currentPosition = currentPosition + this.stUserInput.charAt(i);
                }
            }

            this.stResult = String.valueOf(currentStack.empty() ? 0.0D : (Double)currentStack.pop());
        }
    }

    public boolean isOperand(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private Double operationResult(Double firstNum, Double secondNum, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && firstNum == 0.0D) {
            throw new DivisionByZeroException();
        } else {
            byte var5 = -1;
            switch(operand.hashCode()) {
                case 42:
                    if (operand.equals("*")) {
                        var5 = 2;
                    }
                    break;
                case 43:
                    if (operand.equals("+")) {
                        var5 = 0;
                    }
                case 44:
                case 46:
                default:
                    break;
                case 45:
                    if (operand.equals("-")) {
                        var5 = 1;
                    }
                    break;
                case 47:
                    if (operand.equals("/")) {
                        var5 = 3;
                    }
            }

            switch(var5) {
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
