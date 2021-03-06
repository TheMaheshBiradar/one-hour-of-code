package com.taggy.learning.lambda;

/**
 * This class explains the simple lambda expression which are introduced in java 8
 * This changes the imperical way of writing code to declarative way
 */
public class lambdaTest {

    public static void main(String[] args) {
        // Runnable without lambda
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Without lambda Thread1 started");
            }
        });

        // clean , syntactical sugar
        final Runnable lambdaAsVariable = () -> System.out.println("Lambda as Variable Thread2 started");
        Thread thread2 = new Thread(lambdaAsVariable);

        // clean , syntactical sugar , concise code.

        Thread thread3 = new Thread(() -> System.out.println("Lambda Thread3 started"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
