package com.designpatterns.mypractice.behavioral.strategypattern;

public class TestStrategyPattern {
    public static void main(String[] args) {
        TextFormatter capTextFormatter = new CapTextFormatter();
        TextEditor  editor = new TextEditor(capTextFormatter);
        editor.publishText("Hello World");

        TextFormatter lowerTextFormatter = new LowerTextFormatter();
        editor = new TextEditor(lowerTextFormatter);
        editor.publishText("Hello World");
    }
}
