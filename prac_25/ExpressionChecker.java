package ru.maksim.ikbo2021.new_pracs.prac_25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionChecker {
    public static void main(String[] args) {
        System.out.println(ExpresionChecker("(3*+*5)*–*9*×*4") ? "Correct" : "Incorrect");
        System.out.println(ExpresionChecker("((3*+*5)*–*9*×*4") ? "Correct" : "Incorrect");
    }

    public static Boolean ExpresionChecker(String stExpression) {
        Matcher matcher;
        for(Pattern pattern = Pattern.compile("\\([^()]*\\)"); (matcher = pattern.matcher(stExpression)).find(); stExpression = matcher.replaceAll("")) {
        }

        return !stExpression.contains("(") && !stExpression.contains(")");
    }
}
