package com.example;

public class App {
    public static void main(String[] args) {
        // This will trigger the static block in BuildLogger
        new BuildLogger();

        System.out.println("App is running...");
    }
}
