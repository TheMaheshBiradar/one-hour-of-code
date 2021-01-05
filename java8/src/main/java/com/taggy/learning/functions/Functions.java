package com.taggy.learning.functions;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * This class explains how functions and lambda can be use together.
 *
 * Note that functional Interfaces are nothing but type representations of lambda
 */
public class Functions {

    public static void main(String[] args) {

        // this is the way to store the function.

        Consumer<String> consumerFunction = message -> System.out.println(message);
        Consumer<String> consumerFunctionWithMethodReference = System.out::println;

        consumerFunction.accept("Hello from lambda expression");
        consumerFunctionWithMethodReference.accept("Hello from Method reference");


        Supplier<BigDecimal> salaryMultiplier = () ->  {return BigDecimal.ONE;};

        consumerFunction.accept(salaryMultiplier.get().toString());

        // now look at functions which takes input and provides output

        Function<Integer, String> driverEligibilityFunction = age ->   age> 18 ? "You are allowed to drive" : "Wait for few more years";
        System.out.println(driverEligibilityFunction.apply(22));
        System.out.println(driverEligibilityFunction.apply(17));


        Predicate<Employee> isEmployeeEligibleForHike = employee -> employee.getRating() >3;
        System.out.println(isEmployeeEligibleForHike.test(new Employee("Indra", 10000,4,40)));

    }
}
