package com.monitor.agents;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("My name is " + name);
    }

    public String getName() {
        return name;
    }
}
