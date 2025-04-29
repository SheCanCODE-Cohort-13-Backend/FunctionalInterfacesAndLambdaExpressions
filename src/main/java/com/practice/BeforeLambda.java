package com.practice;

public class BeforeLambda {
    public static void main(String[] args) {
        Greeter peopleGreeter = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        Greeter aiGreeter = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        peopleGreeter.greet("Chanelle");
        aiGreeter.greet("Gemini");
    }
}
