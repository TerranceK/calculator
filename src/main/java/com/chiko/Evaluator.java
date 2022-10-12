package com.chiko;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.parser.ParseException;

public class Evaluator {
    public String eval(String calcString) {
        Expression expression = new Expression(calcString);
        try {
            EvaluationValue result = expression.evaluate();
            return result.getStringValue();
        }
        catch(ParseException | EvaluationException e){
            return "Malformed Expression";
        }
    }
}
