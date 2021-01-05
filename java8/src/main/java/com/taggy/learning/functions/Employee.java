package com.taggy.learning.functions;

public class Employee {

    private String name;
    private Integer salary;
    private Integer rating;
    private Integer age;

    public Employee(String name, Integer salary, Integer rating, Integer age) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
