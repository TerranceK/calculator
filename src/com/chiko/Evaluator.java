package com.chiko;

import java.util.ArrayList;

public class Evaluator{
    private final String calcValue;
    private double result;
    ArrayList<String> infix = new ArrayList<>();

    public Evaluator(String calcValue){
        this.calcValue = calcValue;
    }

    public double getResult(){
        return this.result;
    }

    public String getCalcValue(){
        return this.calcValue;
    }

    public void infixToPostfix(){
        // convert infix to postfix
    }

    public void postfixEvaluator(){
        //code the evaluator.
    }

}
