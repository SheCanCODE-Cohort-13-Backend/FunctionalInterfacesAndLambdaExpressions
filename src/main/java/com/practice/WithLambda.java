package com.practice;

public class WithLambda {
    public static void main(String[] args) {
//        (parameters) -> expression
//        or
//        (parameters) -> { statements; }
        Greeter peopleGreeter = (name) -> System.out.println("Hello " + name);
        Greeter aiGreeter = (name) -> System.out.println("Hello " + name);

        peopleGreeter.greet("Chanelle");
        aiGreeter.greet("Gemini");
    }
}
